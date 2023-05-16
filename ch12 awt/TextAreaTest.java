import java.awt.*;

public class TextAreaTest {
    public static void main(String[] args) {
        Frame f = new Frame("TestArea");
        f.setLayout(new FlowLayout());
        int sb = TextArea.SCROLLBARS_BOTH;
        TextArea ta = new TextArea("", 10, 30, sb);
        f.add(ta);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
