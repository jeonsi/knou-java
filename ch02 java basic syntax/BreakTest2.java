public class BreakTest2 {
    public static void main(String[] args) {
        int n;
        my_block1:
        {
            n = Integer.parseInt(args[0]);
            if(n > 10) break my_block1;
            n = n * 10;
        }
        n = n * 20;
        System.out.println(n);
    }
}
