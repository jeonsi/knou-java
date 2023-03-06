public class StringTest {
    public static void main(String[] args) {
        String szStr1 = "Java Application";
        String szStr2, szStr3;
        szStr2 = "Java Applet";
        szStr2 = szStr1;
        String szStr11 = new String("Java Application");

        String szStr21 = "Java";
        String szStr22 = "Application";
        String szStr23 = szStr21 + szStr22;
        szStr23 = "Java" + 2;
        szStr23 = "Java" + 2.0;
        szStr23 = true + "lines";

        System.out.println("Java String");
        System.out.println('c');
        System.out.println(true);
        System.out.println(2.0);

        int i = 10, j = 20;
        System.out.println(i + " " + j);
        System.out.println(i + j);
    }
}
