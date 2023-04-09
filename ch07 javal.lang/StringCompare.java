public class StringCompare {
    public static void main(String[] args) {
        String str1 = "test";
        String str2 = "test";
        if (str1 == str2)
            System.out.println("str1과 str2는 같다.");
        else
            System.out.println("str1과 str2는 다르다.");
        String str3 = new String("test");
        if(str1 == str3)
            System.out.println("str1과 str3는 같다.");
        else  
            System.out.println("str1과 str3는 다르다.");
    }
}
