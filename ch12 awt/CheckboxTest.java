import java.awt.*;

public class CheckboxTest {
    public static void main(String[] args) {
        Frame f = new Frame("Checkbox");
        f.setLayout(new FlowLayout());
        f.add(new Checkbox("Whiskey"));
        f.add(new Checkbox("Beer"));

        CheckboxGroup group = new CheckboxGroup();
        f.add(new Checkbox("Yes", false, group));
        f.add(new Checkbox("No", true, group));
        f.setSize(300, 80);
        f.setVisible(true);
    }
}
