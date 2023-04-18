import java.io.*;

public class RAFTest {
    public static void main(String[] args) {
        RandomAccessFile raf;
        try {
            raf = new RandomAccessFile("./test.txt", "rw");
            for (int i = 0; i < 10; i++) {
                raf.write(i);
            }
            for (int i = 9; i >= 0; i--) {
                raf.seek(i);
                System.out.println(raf.read());
            }
            raf.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
