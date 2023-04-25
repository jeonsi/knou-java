import java.io.*;

public class ConsoleTest3 {
    public static void main(String[] args) {
        int i;
        try {
            while ((i = System.in.read()) != '끝') {
                System.out.print((char)i);
            }
        } catch (Exception e) {System.out.println(e);}
    }    
}
