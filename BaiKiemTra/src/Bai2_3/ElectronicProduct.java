package Bai2_3;

public class ElectronicProduct extends Product{
    @Override
    double getDiscountPrice() {
        return getPrice()*0.9;
    }
}
