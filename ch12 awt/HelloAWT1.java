import java.awt.*;

class MyFrame extends Frame {
    public MyFrame(String title) {
        super(title);
        this.setSize(400, 300);
        this.setVisible(true);
    }
}

public class HelloAWT1 {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("Hello AWT");
    }
}