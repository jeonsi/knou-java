import java.io.IOException;

public class ExInput2 {
    public static void main(String[] args) throws IOException {
        char c = 0;
        System.out.println("Input a character: ");
        while(true) {
            c = (char) System.in.read();
            if (c == 13 || c == 10) continue;
            if (c == 'q') break;
            System.out.println(c);
            System.out.println("Input a character: ");
        }
    }
}
