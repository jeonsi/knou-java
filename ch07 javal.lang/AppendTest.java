public class AppendTest {
    public static void main(String[] args) {
        String str1 = "선발투수";
        StringBuffer buf1 = new StringBuffer(str1);
        System.out.println(buf1.capacity());
        System.out.println(buf1.length());
        buf1.append(' ').append("박찬호박찬호박찬호박찬호박찬호박찬호박찬호박찬호박찬호박찬호박찬호");
        System.out.println(buf1);
        System.out.println(buf1.capacity());
        str1 = buf1.toString();
        System.out.println(str1);
    }
}
