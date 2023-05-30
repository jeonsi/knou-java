import java.awt.*;

public class ListTest {
    public static void main(String[] args) {
        Frame f = new Frame("List");
        List l = new List(10, true);

        l.add("Red");
        l.add("Green");
        l.add("Blue");
        l.add("Yellow");
        l.add("Cyan");
        f.add(l);
        f.setSize(200, 100);
        f.setVisible(true);
    }
}
