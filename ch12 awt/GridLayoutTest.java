import java.awt.*;

public class GridLayoutTest extends Frame {
    private Scrollbar s1, s2;
    public GridLayoutTest() {
        super("GridLayout");
        setSize(300, 100);
        setLayout(new GridLayout(3, 3));
        add(new Button("button1"));
        add(new Button("button2"));
        add(new Button("button3"));
        add(new Button("button4"));
        add(new Button("button5"));
        add(new Button("button6"));
        add(new Button("button7"));
        add(new Button("button8"));
        add(new Button("button9"));
    }
    public static void main(String[] args) {
        Frame f = new GridLayoutTest();
        f.setVisible(true);
    }
}
