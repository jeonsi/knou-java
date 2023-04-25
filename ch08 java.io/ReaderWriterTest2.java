import java.io.*;

public class ReaderWriterTest2 {
    public static void main(String[] args) {
        try {
            File inFile = new File("./ch08.java.io/ReaderWriterTest.java");
            File outFile = new File("./ch08.java.io/FileTemp.java");
            Reader rd = new FileReader(inFile);
            BufferedReader br = new BufferedReader(rd);
            Writer wd = new FileWriter(outFile);
            BufferedWriter bw = new BufferedWriter(wd);
            int nData = br.read();
            while (nData != -1) {
                bw.write(nData);
                nData = br.read();
            }
            br.close();
            bw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}
