import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {

        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Library Catalog menu:: ");
            System.out.println("1 : Add a book");
            System.out.println("2 : Check Out book");
            System.out.println("3 : Check In book");
            System.out.println("4 : Display all books");
            System.out.println("5 : Exit Application");

            System.out.print("Enter your choice : ");
            String choice = sc.nextLine();

            if (choice.equals("1")) {
                System.out.print("Add book name : ");
                String bookName = sc.nextLine();
                System.out.println("Add Book Author");
                String authorName = sc.nextLine();
                System.out.println("Add Book ISBN number");
                String ISBN = sc.nextLine();
                library.addBookToLibrary(bookName, authorName, ISBN);
            } else if (choice.equals("2")) {
                System.out.print("Enter book name : ");
                String bookName = sc.nextLine();
                library.checkOut(bookName);
            }
        }
    }
}
