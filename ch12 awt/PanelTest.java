import java.awt.*;

public class PanelTest extends Frame {
    Label msg = null;
    Panel msgPanel = null, commandPanel = null;
    Button yesButton = null, noButton = null, cancelButton = null;
    public PanelTest() {
        setTitle("Panel Test");
        msgPanel = new Panel();
        commandPanel = new Panel();

        msg = new Label("안녕하세요");
        msg.setEnabled(false);
        msgPanel.add(msg);

        yesButton = new Button("yes");
        noButton = new Button("no");
        cancelButton = new Button("cancel");

        commandPanel.add(yesButton);
        commandPanel.add(noButton);
        commandPanel.add(cancelButton);

        add("Center", msgPanel);
        add("South", commandPanel);

        setSize(300, 100);
    }
    public static void main(String[] args) {
        PanelTest  pt = new PanelTest();
        pt.setVisible(true);
    }
}
