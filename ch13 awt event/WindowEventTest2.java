import java.awt.*;
import java.awt.event.*;

class MyListener extends WindowAdapter {
    public void windowClosing(WindowEvent ev) {
        System.exit(0);
    }
}

class MyFrame extends Frame {
    public MyFrame(String title) {
        super(title);
        this.setSize(400, 300);
        this.setVisible(true);
        this.addWindowListener(new MyListener());
    }
    public void paint(Graphics g) {
        g.drawString("Hello AWT", 150, 150);
    }
}

public class WindowEventTest2 {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("Hello AWT");
    }
}