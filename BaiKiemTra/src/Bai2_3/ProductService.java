package Bai2_3;

import java.util.Comparator;

public interface ProductService {
    void addProduct(Product p);
    void updateProduct(String id, Product newInfo);
    void deleteProduct(String id);
    void findByName(String name);
    Comparator<? super Product> sortByPriceAsc();
    void sortByPriceDesc();
    void printProducts();


}
