import java.awt.*;

public class ButtonTest extends Frame {
    public ButtonTest(String title) {
        super(title);
        this.setSize(400, 300);
        this.setLayout(null);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        ButtonTest bt = new ButtonTest("Buttone");
        bt.setLayout(null);
        Button b_ok = new Button("OK");
        b_ok.setBounds(10, 240, 50, 50);
        b_ok.setVisible(true);
        bt.add(b_ok);

        Button b_cl = new Button("Cancel");
        b_cl.setBounds(70, 240, 50, 50);
        b_cl.setVisible(true);
        b_cl.setEnabled(false);
        bt.add(b_cl);
    }
}
