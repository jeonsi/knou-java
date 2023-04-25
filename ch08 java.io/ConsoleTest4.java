import java.io.*;

public class ConsoleTest4 {
    public static void main(String[] args) {
        int i;
        InputStreamReader isr = new InputStreamReader(System.in);
        try {
            while ((i = isr.read()) != '끝') {
                System.out.print((char)i);
            }
        } catch (Exception e) {System.out.println(e);}
    }    
}
