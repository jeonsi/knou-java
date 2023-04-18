import java.io.*;

public class FileOutputStreamTest2 {
    public static void main(String[] args) {
        try {
            File inFile, outFile;
            inFile = new File("./ch08.java.io/FileInputStreamTest.java");
            outFile = new File("./ch08.java.io/FileTemp.java");
            InputStream is = new FileInputStream(inFile);
            BufferedInputStream bis = new BufferedInputStream(is);
            OutputStream os = new FileOutputStream(outFile);
            BufferedOutputStream bos = new BufferedOutputStream(os);
            int nData;
            nData = bis.read();
            while (nData != -1) {
                bos.write(nData);
                nData = bis.read();
            }
            bis.close();
            bos.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }    
}
