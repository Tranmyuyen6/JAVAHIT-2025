package Homework;

public class Book {
    private static int bookId = 0;
    private String title;
    private String author;
    private double price;
    private Publisher publisher;

    public Book(){

    }

    public Book(String title, String author, double price, Publisher publisher) {

        bookId++;
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
    }
    public Book(String title, String author, double price) {
        bookId++;
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = new Publisher("unknown","unknown");

    }

    public  int getBookId() {
        return bookId;
    }

    public  void setBookId(int bookId) {
        Book.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
    public void displayInfo(){
        System.out.printf("%-10s %-10s %-15s %-15s", title, author, price);

    }
    public void displayInfo(boolean showPublisher){
        if(showPublisher)
            System.out.println(this.publisher);
        else
            System.out.println("Publisher: Unknown");
    }
}
