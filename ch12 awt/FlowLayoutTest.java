import java.awt.*;

public class FlowLayoutTest extends Frame {
    private Scrollbar s1, s2;
    public FlowLayoutTest() {
        super("FlowLayout");
        setSize(300, 100);
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 0));
        add(new Button("button1"));
        add(new Button("button2"));
        add(new Button("button3"));
        add(new Button("button4"));
        add(new Button("button5"));
        add(new Button("button6"));
    }
    public static void main(String[] args) {
        Frame f = new FlowLayoutTest();
        f.setVisible(true);
    }
}
