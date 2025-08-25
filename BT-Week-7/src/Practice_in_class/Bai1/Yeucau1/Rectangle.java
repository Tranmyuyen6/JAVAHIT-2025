package Practice_in_class.Bai1.Yeucau1;

public class Rectangle extends Shape{
    double dai;
    double rong;

    public Rectangle(){

    }

    public Rectangle(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    @Override
    double area() {
        return dai*rong;
    }
}
