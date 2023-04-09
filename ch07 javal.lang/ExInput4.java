import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExInput4 {
    public static void main(String[] args) throws IOException {
        String line;
        int n;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader is = new BufferedReader(isr);
        System.out.println("Input an integer: ");
        line = is.readLine();
        n = Integer.parseInt(line);
        System.out.println(n);
    }
}
