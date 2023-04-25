import java.io.*;

public class ReaderWriterTest {
    public static void main(String[] args) {
        try {
            File inFile = new File("./ch08.java.io/ReaderWriterTest.java");
            File outFile = new File("./ch08.java.io/FileTemp.java");
            Reader rd = new FileReader(inFile);
            Writer wd = new FileWriter(outFile);
            int nData = rd.read();
            while (nData != -1) {
                wd.write(nData);
                nData = rd.read();
            }
            wd.close();
            rd.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}
