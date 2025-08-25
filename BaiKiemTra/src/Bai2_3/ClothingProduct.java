package Bai2_3;

public class ClothingProduct extends Product{
    @Override
    double getDiscountPrice() {
        return 0.8*getPrice();
    }
}
