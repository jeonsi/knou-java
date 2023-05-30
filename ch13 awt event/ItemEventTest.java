import java.awt.*;
import java.awt.event.*;

class MyListener implements ItemListener {
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
public class ItemEventTest extends Frame {
    public static void main(String[] args) {
        ItemEventTest f = new ItemEventTest();
        MyListener ml = new MyListener();
        Checkbox cb1, cb2, cb3, cb4;
        f.setLayout(new FlowLayout());
        f.setSize(300, 80);
        cb1 = new Checkbox("Whiskey");
        cb1.addItemListener(ml);
        cb2 = new Checkbox("Beer");
        cb2.addItemListener(ml);
        f.add(cb1);
        f.add(cb2);

        CheckboxGroup group = new CheckboxGroup();
        cb3 = new Checkbox("Yes", false, group);
        cb3.addItemListener(ml);
        cb4 = new Checkbox("No", true, group);
        cb4.addItemListener(ml);
        f.add(cb3);
        f.add(cb4);
        f.setVisible(true);
    }
}
