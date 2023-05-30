import java.awt.*;
import java.awt.event.*;
import java.awt.Point;

class MyMouseMotionListener extends MouseMotionAdapter {
    public void mouseMoved(MouseEvent ev) {
        Point p = ev.getPoint();
        System.out.println("Mouse is "+ p);
    }
}
public class MouseMotionListenerTest {
    public static void main(String[] args) {
        Frame f = new Frame("MouseEvent");
        MouseMotionListener ml = new MyMouseMotionListener();
        f.addMouseMotionListener(ml);
        f.setSize(200, 100);
        f.setVisible(true);           
    }
}
