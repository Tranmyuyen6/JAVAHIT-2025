package Bai2_3;

public class FoodProduct extends Product{
    @Override
    double getDiscountPrice() {
        return getPrice()*0.95;
    }
}
