import java.util.ArrayList;
import java.util.List;

class Book {
    // Attributes
    private String title;
    private String author;
    private String isbn;
    private double price;
    private int stockQuantity;

    // Constructor
    public Book(String title, String author, String isbn, double price, int stockQuantity) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    // Getters and Setters
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                '}';
    }
}

class BookStore {
    // Attribute: List to hold books
    private List<Book> inventory;

    // Constructor
    public BookStore() {
        this.inventory = new ArrayList<>();
    }

    // Method to add a book to the inventory
    public void addBook(Book book) {
        inventory.add(book);
    }

    // Method to remove a book from the inventory based on ISBN
    public void removeBook(String isbn) {
        inventory.removeIf(book -> book.getIsbn().equals(isbn));
    }

    // Method to update the stock quantity of a book
    public void updateStock(String isbn, int quantity) {
        for (Book book : inventory) {
            if (book.getIsbn().equals(isbn)) {
                book.setStockQuantity(quantity);
                break;
            }
        }
    }

    // Method to display all books in the inventory
    public void printInventory() {
        if (inventory.isEmpty()) {
            System.out.println("The inventory is empty.");
        } else {
            for (Book book : inventory) {
                System.out.println(book);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a BookStore instance
        BookStore store = new BookStore();

        // Add books to the inventory
        store.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", 10.99, 5));
        store.addBook(new Book("1984", "George Orwell", "9780451524935", 8.99, 10));
        store.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084", 7.99, 7));

        // Update stock quantity for a book
        store.updateStock("9780451524935", 15);

        // Remove a book from the inventory
        store.removeBook("9780061120084");

        // Print the current inventory
        store.printInventory();
    }
}
