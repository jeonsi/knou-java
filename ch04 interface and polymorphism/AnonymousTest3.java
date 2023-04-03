public class AnonymousTest3 {
    public static void main(String[] args) {
        MyInterface sub = new MyInterface() {
            public void method() {System.out.println("sub1");}
        };
        sub.method();
    }
}

interface MyInterface {
    public void method();
}