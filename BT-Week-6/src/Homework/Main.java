package Homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        int num;

        do{
            System.out.println("chọn chức năng:");
            System.out.println("1-Nhập từ bàn phím để thêm sách vào thư viện (3-4 quyển)");
            System.out.println("2-Hiển thị danh sách sách");
            System.out.println("3-Tìm sách theo tác giả");
            System.out.println("4-Xóa sách theo mã sách và hiển thị kết quả");
            System.out.println("5-Thoát chương trình");

            num = sc.nextInt();
            sc.nextLine();

            switch(num){
                case 1:
                    System.out.println("tiêu đề: ");
                    String title = sc.nextLine();
                    System.out.println("tác giả: ");
                    String author = sc.nextLine();
                    System.out.println("giá tiền: ");
                    double price = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("nhập nhà xuất bản (nếu có: y; nếu không: n");
                    String yesno = sc.nextLine();

                    if(yesno.equalsIgnoreCase("y")){
                        System.out.println("tên nhà xuất bản: ");
                        String name = sc.nextLine();
                        System.out.println("địa chỉ nxb: ");
                        String address = sc.nextLine();
                        Publisher publisher = new Publisher(name, address);
                        library.addBook(new Book( title, author, price, publisher));
                    }
                    else{
                        library.addBook(new Book(title, author, price));
                    }
                    break;
                case 2:
                    System.out.println("danh saách không có nhà xuất bản(nhập false)");
                    System.out.println("danh sách có nhà xuất bản(nhập true)");
                    boolean choose = sc.nextBoolean();
                    library.displayAllBooks(choose);
                    break;
                case 3:
                    System.out.println("nhập tên tác giả của cuốn sách cần tìm: ");
                    String name = sc.nextLine();
                    library.searchByAuthor(name);
                    break;
                case 4:
                    System.out.println("nhập mã sách cần xóa: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    library.removeBookById(id);
                    break;
                case 5:
                    System.out.println("kết thúc");
                    break;
                default:
                    System.out.println("không hợp lệ, nhập lại");
            }
        }
        while (num != 5);
    }
}
