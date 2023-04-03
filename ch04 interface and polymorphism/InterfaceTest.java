interface Figure {
    double getArea();
}

class Triangle implements Figure {
    private double height, width;
    public Triangle(double h, double w) {height = h; width = w;}
    public double getArea() {return height * width * 0.5;} 
}

class Box implements Figure {
    private double height, width;
    public Box(double h, double w) {height = h; width = w;}
    public double getArea() {return height * width;} 
}

class Circle implements Figure {
    private double radius;
    public Circle(double r) {radius = r;}
    public double getArea() {return radius * radius * 3.14;} 
}

class InterfaceTest {
    public static void main(String[] args) {
        Figure figure1, figure2, figure3;
        figure1 = new Triangle(3.0, 4.0);
        System.out.println(figure1.getArea());
        figure2 = new Box(3.0, 4.0);
        System.out.println(figure2.getArea());
        figure3 = new Circle(3.0);
        System.out.println(figure3.getArea());
    }
}