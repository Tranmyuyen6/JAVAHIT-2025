import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args){
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        System.out.println("danh sách: " + fruits);

        fruits.remove("apple");
        System.out.println("sau xóa: "+fruits);
    }
}
