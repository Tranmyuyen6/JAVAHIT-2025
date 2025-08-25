package Practice_in_class.Bai3.Yc1;

public abstract class Employee {
    private double luongCoBan;

    public Employee() {
        this.luongCoBan = luongCoBan;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getSalary(double luongCoBan){
        return luongCoBan;
    }

    public abstract double getSalary(double luongCoBan, double phuCap);
}
