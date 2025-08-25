package Practice_in_class.Bai1.Yeucau1;

public class Circle extends Shape{
    double r;

    public Circle(){

    }

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
        return 3.14*r*r;
    }
}
