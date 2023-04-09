public class ReverseTest {
    public static void main(String[] args) {
        String str1 = "test string";
        StringBuffer sb = new StringBuffer(str1);
        sb.reverse();
        str1 = sb.toString();
        System.out.println(str1);
    }
}