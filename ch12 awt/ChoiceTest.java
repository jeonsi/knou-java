import java.awt.*;

public class ChoiceTest {
    public static void main(String[] args) {
        Frame f = new Frame("Choice");
        Choice c = new Choice();

        c.add("Red");
        c.add("Blue");
        c.add("Green");

        f.add(c);
        f.setSize(200, 100);
        f.setVisible(true);
    }
}
