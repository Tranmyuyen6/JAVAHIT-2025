package Practice_in_class.Bai3.Yc3;

public class Circle extends Shape{
    private static final double PI = 3.14;
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    double area() {
        return PI*r*r;
    }
}
