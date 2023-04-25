import java.io.*;

public class ConsoleTest {
    public static void main(String[] args) {
        int i;
        try {
            while ((i = System.in.read()) != 'q') {
                System.out.print((char)i);
            }
        } catch(Exception e) {System.out.println(e);}
    }    
}
