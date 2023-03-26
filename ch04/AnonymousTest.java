public class AnonymousTest {
    public static void main(String[] args) {
        CSub sub = new CSub();
        sub.method1();
        sub.method2();
        sub.method3();
        System.out.println(sub.a);
        System.out.println(sub.b);
    }
}

class CSub extends CSuper {
    public int b = 20;
    public void method1() {System.out.println("sub1");}
    public void method3() {System.out.println("sub3");}
}

class CSuper {
    public int a = 10;
    public void method1() {System.out.println("super1");}
    public void method2() {System.out.println("super2");}
}