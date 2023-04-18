import java.io.*;

public class FileTest {
    public static void main(String[] args) {
        File myFile = new File("./FileTest.java");
        System.out.println(myFile.getName());
        System.out.println(myFile.getPath());
        System.out.println(myFile.length());
    }
}