import java.awt.*;
import java.awt.event.*;

class ChoiceListener implements ItemListener {
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

public class ChoiceEventTest {
    public static void main(String[] args) {
        Frame f = new Frame("Choice");
        Choice c = new Choice();

        c.add("Red");
        c.add("Blue");
        c.add("Green");
        c.addItemListener(new ChoiceListener());

        f.add(c);
        f.setSize(200, 100);
        f.setVisible(true);
    }
}
