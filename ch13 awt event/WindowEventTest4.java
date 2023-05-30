import java.awt.*;
import java.awt.event.*;

class MyListener extends WindowAdapter {
    public void windowClosing(WindowEvent ev) {
        Window w = ev.getWindow();
        w.dispose();
    }
    public void windowActivated(WindowEvent ev) {System.out.println("Activated");}
    public void windowClosed(WindowEvent ev) {System.out.println("Closed");}
    public void windowDeactivated(WindowEvent ev) {System.out.println("Deactivated");}
    public void windowDeiconified(WindowEvent ev) {System.out.println("Deiconified");}
    public void windowIconified(WindowEvent ev) {System.out.println("Iconified");}
    public void windowOpened(WindowEvent ev) {System.out.println("Opend");}
}
public class WindowEventTest4 extends Frame {
    public static void main(String[] args) {
        WindowEventTest4 f = new WindowEventTest4();
        f.addWindowListener(new MyListener());
        f.setSize(300, 300);
        f.setVisible(true);
    }
}
