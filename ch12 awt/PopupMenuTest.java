import java.awt.*;

public class PopupMenuTest {
    public static void main(String[] args) {
        Frame f = new Frame("Popup Menu");
        PopupMenu pm = new PopupMenu("Popup");
        pm.add(new MenuItem("MenuItem1"));
        Menu sm = new Menu("SubMenu1");
        sm.add(new MenuItem("SubMenuItem1"));
        pm.add(sm);
        f.add(pm);
        f.setSize(300, 200);
        f.setBackground(Color.white);
        f.setVisible(true);
        pm.show(f, 10, 100);
    }
}
