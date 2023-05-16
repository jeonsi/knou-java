import java.awt.*;

public class TextFieldTest {
    public static void main(String[] args) {
        Frame f = new Frame("TextField");
        f.setLayout(new FlowLayout());
        TextField tf = new TextField(20);
        f.add(tf);
        f.setSize(300, 200);;
        f.setVisible(true);
    }
}
