import java.awt.*;

class MyCanvas extends Canvas {
    Color bColor;
    public MyCanvas(Color newColor) {
        bColor = newColor;
        setBackground(newColor);
        setSize(60, 60);
    }
    public void paint(Graphics g) {
        setBackground(bColor);
    }
}

public class CanvasTest {
    public static void main(String[] args) {
        Frame f = new Frame("Canvas");
        f.setLayout(new FlowLayout());
        f.add(new MyCanvas(Color.red));
        f.add(new MyCanvas(Color.green));
        f.add(new MyCanvas(Color.blue));
        f.add(new MyCanvas(Color.orange));
        f.add(new MyCanvas(Color.magenta));
        f.add(new MyCanvas(Color.pink));
        f.add(new MyCanvas(Color.yellow));
        f.add(new MyCanvas(Color.cyan));
        f.add(new MyCanvas(Color.black));
        f.add(new MyCanvas(Color.gray));
        f.setSize(350, 180);
        f.setVisible(true);
    }
}