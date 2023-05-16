import java.awt.*;

public class BorderLayoutTest extends Frame {
    private Scrollbar s1, s2;
    public BorderLayoutTest() {
        super("BorderLayout");
        setSize(300, 300);
        setLayout(new BorderLayout(10, 10));
        Label l_east = new Label("EAST", Label.CENTER);
        l_east.setBackground(Color.red);
        Label l_west = new Label("WEST", Label.CENTER);
        l_west.setBackground(Color.blue);
        Label l_south = new Label("SOUTH", Label.CENTER);
        l_south.setBackground(Color.green);
        Label l_north = new Label("NORTH", Label.CENTER);
        l_north.setBackground(Color.yellow);
        Label l_center = new Label("CENTER", Label.CENTER);
        l_center.setBackground(Color.gray);
        add(l_east, BorderLayout.EAST);
        add(l_south, BorderLayout.SOUTH);
        add(l_west, BorderLayout.WEST);
        add(l_north, BorderLayout.NORTH);
        add(l_center, BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        Frame f = new BorderLayoutTest();
        f.setVisible(true);
    }
}
