package Practice_in_class.Bai3;

public class Car {
    protected String brand = "Rolls-Royce";
    protected int maxSpeed = 600;

    public Car(){

    }
    public Car(String brand, int maxSpeed){
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }
    public void run(){
        System.out.println("xe "+this.brand+" đang chaạy với tốc độ tối đa "+this.maxSpeed+" km/h.");
    }
}
