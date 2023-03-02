public class ScopeTest {
    public static void main(String[] args) {
        int outer = 1;
        {
            int inner = 2;
            System.out.println("inner = " + inner); // 2
            System.out.println("outer = " + outer); // 1
        }
        int inner = 3;
        System.out.println("inner = " + inner); // 3
        System.out.println("outer = " + outer); // 1
    }
}
