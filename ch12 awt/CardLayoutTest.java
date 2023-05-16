import java.awt.*;

public class CardLayoutTest extends Frame {
    private Scrollbar s1, s2;
    CardLayout cl;
    public CardLayoutTest() {
        super("CardLayout");
        setSize(300, 100);
        cl = new CardLayout();
        setLayout(cl);
        add("1", new Label("안녕하세요.", Label.CENTER));
        add("2", new Label("만나서 반가워요.", Label.CENTER));
        add("3", new Label("다음에 또 만나요.", Label.CENTER));
    }
    public void Rotate() throws Exception {
        cl.first(this);
        Thread.sleep(1000);
        while (true) {
            cl.next(this);
            Thread.sleep(1000);
        }
    }
    public static void main(String[] args) throws Exception {
        CardLayoutTest f = new CardLayoutTest();
        f.setVisible(true);
        f.Rotate();
    }
}
