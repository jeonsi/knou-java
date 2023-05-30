import java.awt.*;
import java.awt.event.*;

class MyTextListener implements TextListener {
    public void textValueChanged(TextEvent ev) {
        System.out.println(ev);
    }
}

public class TextAreaEventTest {
    public static void main(String[] args) {
        Frame f = new Frame("TextArea");
        f.setLayout(new FlowLayout());
        TextArea ta = new TextArea(" ", 10, 30, TextArea.SCROLLBARS_BOTH);
        ta.addTextListener(new MyTextListener());
        f.add(ta);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
