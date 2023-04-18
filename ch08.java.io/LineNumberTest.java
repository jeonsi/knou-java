import java.io.*;

public class LineNumberTest {
    public static void main(String[] args) {
        try {
            File file = new File("./ch08.java.io/LineNumberTest.java");
            FileReader fr = new FileReader(file);
            LineNumberReader rd = new LineNumberReader(fr);
            String line;
            while ((line = rd.readLine()) != null) {
                System.out.println(rd.getLineNumber() + line);
            }
            rd.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }    
}
