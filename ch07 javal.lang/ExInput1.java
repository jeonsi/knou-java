public class ExInput1 {
    public static void main(String[] args) throws Exception {
        char c = 0;
        System.out.println("Input a character: ");
        c = (char) System.in.read();
        System.out.println(c);
        System.out.println(System.in.available());
    }
}
