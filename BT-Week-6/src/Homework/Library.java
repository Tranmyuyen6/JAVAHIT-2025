package Homework;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private ArrayList<Book> listBook = new ArrayList<>();

    public Library(){

    }

    public Library(ArrayList<Book> listBook) {
        this.listBook = listBook;
    }

    public ArrayList<Book> getListBook() {
        return listBook;
    }

    public void setListBook(ArrayList<Book> listBook) {
        this.listBook = listBook;
    }

    public void addBook(Book book){
        listBook.add(book);
    }

    public void displayAllBooks(boolean showPublisher){
        System.out.println("danh sách tất cả sách: ");
        for(Book book : listBook){
            book.displayInfo(showPublisher);
        }
    }

    public void searchByAuthor(String author){
        boolean hopLe = false;
        for(Book book : listBook){
            if(book.getAuthor().toLowerCase().contains(book.getAuthor())){
                book.displayInfo(true);
                hopLe = true;
            }
        }
        if(!hopLe){
            System.out.println("không có sách naò của tác giả này");
        }
    }

    public void removeBookById(int bookId){
        boolean remove = false;
        for(int i=0;i< listBook.size();i++){
            if(listBook.get(i).getBookId() == bookId){
                listBook.remove(i);
                remove = true;
            }
            else{
                System.out.println("không tìm thấy mã sách");
            }
        }
    }
}
