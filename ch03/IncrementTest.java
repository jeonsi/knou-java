public class IncrementTest {
    public static void main(String[] args) {
        int x = 5, a, b;
        a = ++x*x--;
        b = x*10;
        System.out.printf("Result: %d %d %d", a , b , x);
    }
}
