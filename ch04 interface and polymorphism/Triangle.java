abstract class Shape {
    public double height, width;

    public Shape(double h, double w) {height = h; width = w;}

    public void setHeight(double h) {height = h;}
    public void setWidth(double w) {width = w;}
    public double getHeight() {return height;}
    public double getWidth() {return width;}
    public abstract double getArea();
}

class Triangle extends Shape {
    public Triangle(double h, double w) {super(w, h);}
    public double getArea() {return height * width * 0.5;}

    public static void main(String[] args) {
        Box box = new Box(4, 5);
        System.out.println(box.getArea());

        Triangle triangle = new Triangle(4, 5);
        System.out.println(triangle.getArea());
    }
}

class Box extends Shape {
    public Box(double h, double w) {super(h, w);}
    public double getArea() {return height * width;}
}
