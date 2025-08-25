package Practice_in_class.Bai2.Yc1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Lão hạc", "Nam Cao"));
        books.add(new Book("Vọng Nguyệt", "Hồ Chí Minh"));
        books.add(new Book("Chí Phèo", "Nam Cao"));

        for(Book b : books){
            System.out.println(b);
        }
    }
}
