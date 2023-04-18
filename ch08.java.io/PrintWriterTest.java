import java.io.*;

public class PrintWriterTest {
    public static void main(String[] args) {
        CharArrayWriter dest = new CharArrayWriter();
        PrintWriter pw = new PrintWriter(dest);
        pw.print(10);
        pw.print('+');
        pw.print(2.0);
        pw.print('=');
        pw.print(10 + 2.0);
        pw.println();
        pw.flush();
        System.out.println(dest);
        pw.close();
    }    
}
