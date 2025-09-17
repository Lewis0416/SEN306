//NAME : APOTIADE JOSEPH
//MATRIC : IFT/22/9201

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₦" + price);
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Big Bang Theory", "Joseph Apotiade", 9500.00);
        book1.display();
    }
}
