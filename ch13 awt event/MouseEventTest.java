import java.awt.*;
import java.awt.event.*;
import java.awt.Point;

class MyMouseListener extends MouseAdapter {
    public void mouseClicked(MouseEvent ev) {
        Point p = ev.getPoint();
        String btn = null;
        switch (ev.getButton()) {
            case MouseEvent.BUTTON1: btn = "Left Button";
            break;
            case MouseEvent.BUTTON2: btn = "Middle Button";
            break;
            case MouseEvent.BUTTON3: btn = "Right Button";
            break;
        }
        System.out.println("Mouse " + btn + " clicked: " + p);
    }
}
public class MouseEventTest {
    public static void main(String[] args) {
        Frame f = new Frame("MouseEvent");
        MouseListener ml = new MyMouseListener();
        f.addMouseListener(ml);
        f.setSize(200, 100);
        f.setVisible(true);           
    }
}
