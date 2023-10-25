import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();
    Book book;

    public void addBookToLibrary(String bookName, String authorName, String ISBN) {
        book = new Book(bookName, authorName, ISBN);
        books.add(book);
    }

    public void checkOut(String bookName) {
        book = findBookInLibrary(bookName);

        if (book != null) {
            if (book.getAvailable()) {
                book.setAvailable(false);
                System.out.println(bookName + " is checked out.");
            } else {
                System.out.println(bookName + " is already checked out.");
            }
        } else {
            System.out.println(bookName + " is not available in library.");
        }
    }

    private Book findBookInLibrary(String bookName) {

        for (Book bk : books) {
            if (bk.getBookName().equals(bookName)) {
                return bk;
            }
        }
        return null;
    }
}
