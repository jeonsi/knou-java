import java.io.*;

public class FileInputStreamTest {
    public static void main(String[] args) {
        File file;
        file = new File("ch08.java.io/FileInputStreamTest.java");
        try {
            InputStream is = new FileInputStream(file);
            int nData;
            nData = is.read();
            while (nData != -1) {
                System.out.write(nData);
                nData = is.read();
            }
            is.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
