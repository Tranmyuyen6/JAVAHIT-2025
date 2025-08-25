package Practice_in_class.Bai2.Yc5;

public class MathUtils {
    private static final double PI = 3.14;
    private double r;

    public MathUtils(){

    }
    public MathUtils(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double circleArea(double r){
        return PI*r*r;
    }
}
