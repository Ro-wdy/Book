import java.util.ArrayList;
import java.util.List;

public class Book {
	 // Attributes: title, author, ISBN
    private String title;
    private String author;
    private String ISBN;

    // Constructor to initialize Book attributes
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Getters for the attributes
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    // toString method to print book details
    @Override
    public String toString() {
        return "Book [Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + "]";
    }

    // Main class to manage book collection
    public static class BookCollection {
        // List to hold the collection of books
        private List<Book> books;

        // Constructor to initialize the book list
        public BookCollection() {
            books = new ArrayList<>();
        }

        // Method to add a book to the collection
        public void addBook(Book book) {
            books.add(book);
            System.out.println(book.getTitle() + " has been added to the collection.");
        }

        // Method to remove a book from the collection by its ISBN
        public void removeBookByISBN(String ISBN) {
            boolean found = false;
            for (Book book : books) {
                if (book.getISBN().equals(ISBN)) {
                    books.remove(book);
                    System.out.println(book.getTitle() + " has been removed from the collection.");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("No book found with ISBN: " + ISBN);
            }
        }

        // Method to display all books in the collection
        public void displayBooks() {
            if (books.isEmpty()) {
                System.out.println("No books in the collection.");
            } else {
                System.out.println("Books in the collection:");
                for (Book book : books) {
                    System.out.println(book);
                }
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create a book collection
        BookCollection myCollection = new BookCollection();

        // Create some books
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", "9780316769488");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");
        Book book3 = new Book("1984", "George Orwell", "9780451524935");

        // Add books to the collection
        myCollection.addBook(book1);
        myCollection.addBook(book2);
        myCollection.addBook(book3);

        // Display books in the collection
        myCollection.displayBooks();

        // Remove a book by ISBN
        myCollection.removeBookByISBN("9780061120084");

        // Display books in the collection after removal
        myCollection.displayBooks();
   
	}

}
