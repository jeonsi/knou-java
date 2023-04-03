public class Point implements Movable {
    double x, y;
    public void add(double dx, double dy) {x += dx; y += dy;}
    public void sub(double dx, double dy) {x -= dx; y -= dy;}
    public void mul(double s) {x *= s; y *= s;}
    public void div(double s) { x /= s; y /= s;}
}

interface Movable {
    void add(double dx, double dy);
    void sub(double dx, double dy);
    default double change_sign(double v) {return v * (-1.0);}
}

interface Scalable {
    void mul(double s);
    void div(double s);
}

class DefaultTest {
    public static void main(String[] args) {
        Point p = new Point();
        p.x = 10.5;
        p.y = 11.6;
        System.out.println(p.change_sign(p.x));
    }
}