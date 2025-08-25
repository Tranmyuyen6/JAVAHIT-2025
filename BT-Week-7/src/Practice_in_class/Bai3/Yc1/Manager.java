package Practice_in_class.Bai3.Yc1;

public class Manager extends Employee {
    private double phuCap;

    public Manager(){
        super();

    }

    public Manager(double luongCoBan, double phuCap) {
        super();
        this.phuCap = phuCap;
    }

    public double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }


    @Override
    public double getSalary(double luongCoBan, double phuCap) {
        return super.getSalary(luongCoBan)+phuCap;
    }
}
