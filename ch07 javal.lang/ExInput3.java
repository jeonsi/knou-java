import java.io.IOException;

public class ExInput3 {
    public static void main(String[] args) throws IOException {
        int n = 0;
        System.out.println("Input an integer: ");
        while(true) {
            n = System.in.read();
            if (n == 13 || n == 10) continue;
            if (n == 'q') break;
            System.out.println(n - '0');
            System.out.println("Input an integer: ");
        }
    }
}
