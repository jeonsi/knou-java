import java.awt.*;

public class LabelTest {
    public static void main(String[] args) {
        Frame f = new Frame("Label");
        Label l = new Label("Welcome");

        f.add(l);
        f.setSize(200, 100);
        f.setVisible(true);
    }
}
