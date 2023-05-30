import java.awt.*;
import java.awt.event.*;

class MenuListener implements ActionListener {
    public void actionPerformed(ActionEvent ev) {
        System.out.println(ev.getActionCommand());
    }
}

class CheckMenuListener implements ItemListener {
    public void itemStateChanged(ItemEvent ev) {
        String item = (String)ev.getItem();
        System.out.print(item + "\t");
        if (ev.getStateChange() == ItemEvent.SELECTED) {
            System.out.println("SELECTED");
        } else {
            System.out.println("DESELECTED");
        }
    }
}

public class PulldownMenu2 extends Frame {
    MenuBar mb;
    ActionListener al;

    public void setMenu() {
        Menu m, sm;
        mb = new MenuBar();
        m = new Menu("Menu1");
        m.add(new MenuItem("MenuItem1"));
        sm = new Menu("SubMenu1", true);
        sm.add(new MenuItem("SubMenuItem1"));
        sm.add(new CheckboxMenuItem("SubMenuItem2"));
        m.add(sm);
        m.add(new MenuItem("MenuItem2"));
        mb.add(m);
        setMenuBar(mb);
        for (int i = 0; i < mb.getMenuCount(); i++) {
            m = mb.getMenu(i);
            registerListener((MenuItem)m);
        }
    }
    private void registerListener(MenuItem mi) {
        mi.addActionListener(al);
        if (mi instanceof Menu) {
            Menu mm = (Menu)mi;
            for (int i = 0; i < mm.getItemCount(); i++) {
                registerListener(mm.getItem(i));
            }
        } else if (mi instanceof CheckboxMenuItem) {
            CheckMenuListener cml = new CheckMenuListener();
            ((CheckboxMenuItem)mi).addItemListener(cml);
        }
    }
    public PulldownMenu2() {
        al = new MenuListener();
    }
    public static void main(String[] args) {
        PulldownMenu2 f = new PulldownMenu2();
        f.setSize(200, 200);
        f.setVisible(true);
        f.setMenu();;
    }
}
