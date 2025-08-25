package Bai2_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ProductServiceImpl implements ProductService{
    Scanner sc = new Scanner(System.in);
    ArrayList<Product> products = new ArrayList<>();

    @Override
    public void addProduct(Product p) {
        products.add(p);
    }

    @Override
    public void updateProduct(String id, Product newInfo) {
        System.out.println("nhập id:");
        id = sc.nextLine();
        System.out.println("tên sửa: ");
        String name = sc.nextLine();
        System.out.println("giá sửa:");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.println("số lượng: ");
        int quantity = sc.nextInt();
        sc.nextLine();
        System.out.println("loại: ");
        String category = sc.nextLine();
        System.out.println("nhà sx:");
        String manufacturer = sc.nextLine();
    }

    @Override
    public void deleteProduct(String id) {
        System.out.println("nhập id xóa:");
        id = sc.nextLine();
        products.remove(id);
    }

    @Override
    public void findByName(String name) {
        System.out.println("nhập tên sp:");
        name = sc.nextLine();
        for(Product p : products){
            p.getName().equalsIgnoreCase(name);
        }

    }

    @Override
    public Comparator<? super Product> sortByPriceAsc() {
        for(Product p : products){
            System.out.println(p.getPrice());
        }
        return null;
    }

    @Override
    public void sortByPriceDesc() {
        for(Product p : products){
            System.out.println(p.getPrice());
        }

    }

    @Override
    public void printProducts() {
        System.out.printf("%-8s | %-10s | %-15s | %-20s | %-15s | %-10s | %-20\n","ID", "name", "manufacturer(name)","quantity","price", "discount price");
    }
}
