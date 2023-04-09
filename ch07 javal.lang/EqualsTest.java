class Man1 {}

class Man2 {
    public int nData;
    public Man2(int nNew) {nData = nNew;}
    public boolean qeuals(Object obj) {
        if (obj instanceof Man2) {
            Man2 m = (Man2) obj;
            if (this.nData == m.nData) return true;
        }
        return false;
    }
}

public class EqualsTest {
    public static void main(String[] args) {
        Man1 m1 = new Man1();
        Man1 m2 = new Man1();
        System.out.println("m1 == m2: " + (m1 == m2));
        System.out.println("m1.qeuals(m2): " + m1.equals(m2));
        Man2 m3 = new Man2(1);
        Man2 m4 = new Man2(1);
        System.out.println("m3 == m4: " + (m3 == m4));
        System.out.println("m3.equals(m4): " + m3.qeuals(m4));

        String str1 = "Java Applcation";
        String str2 = "Java Applcation";
        String str3 = new String("Java Applcation");
        String str4 = new String("Java Applcation");
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str3));
        System.out.println(str1 == str3);        
        System.out.println(str3.equals(str4));
        System.out.println(str3 == str4);        
    }
}
