// When overriding, return type can be a subclass.

class Shape {
}

class Triangle extends Shape {
}

interface Test {
    Shape method1();
}

public class OverridingTest implements Test {
    public Triangle method1() {
        System.out.println("method1");
        Triangle t = new Triangle();
        return t;
    }
}
