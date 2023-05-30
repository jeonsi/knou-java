import java.awt.*;
import java.awt.event.*;

class ButtonLabels {
    static String OK = "OK";
    static String CANCEL = "Cancel";
}

class MyListener implements ActionListener {
    public void actionPerformed(ActionEvent ev) {
        if (ButtonLabels.OK.equals(ev.getActionCommand())) {
            System.out.println("OK 버튼이 눌렸습니다.");
        } else if (ButtonLabels.CANCEL.equals(ev.getActionCommand())) {
            System.out.println("Cancel 버튼이 눌렸습니다.");
        }
    }
}

public class ButtonTest extends Frame {
    public ButtonTest(String title) {
        super(title);
        this.setLayout(new FlowLayout());
        this.setSize(400, 100);
    }
    public static void main(String[] args) {
        ButtonTest bt = new ButtonTest("ActionEvent");
        Button b_ok = new Button(ButtonLabels.OK);
        Button b_cancel = new Button(ButtonLabels.CANCEL);
        MyListener ml = new MyListener();
        b_ok.addActionListener(ml);
        b_cancel.addActionListener(ml);

        bt.add(b_ok);
        bt.add(b_cancel);
        bt.setVisible(true);
    }
}
