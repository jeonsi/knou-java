import java.io.*;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        try {
            File inFile, outFile;
            inFile = new File("./ch08.java.io/FileInputStreamTest.java");
            outFile = new File("./ch08.java.io/FileTemp.java");
            InputStream is = new FileInputStream(inFile);
            OutputStream os = new FileOutputStream(outFile);
            int nData;
            nData = is.read();
            while (nData != -1) {
                os.write(nData);
                nData = is.read();
            }
            is.close();
            os.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }    
}
