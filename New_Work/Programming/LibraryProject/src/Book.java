public class Book {
    private final String bookName;
    private final String authorName;
    private final String ISBN;
    private Boolean available;

    public Book(String bookName, String authorName, String ISBN) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.ISBN = ISBN;
        this.available = true;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getISBN() {
        return ISBN;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}
