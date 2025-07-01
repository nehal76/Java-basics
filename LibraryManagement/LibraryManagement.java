import java.util.*;

class Book {
    protected String title;
    protected String author;
    protected String Id;
    protected boolean isIssued = false;
}

class AddBook extends Book {

    public AddBook(String title, String author, String Id) {
        this.title = title;
        this.author = author;
        this.Id = Id;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ID: " + Id);
    }

}

public class LibraryManagement {
    public static void main(String[] args) {

        System.out.println("Welcome to the Library Management System");
        Scanner scanner = new Scanner(System.in);
        ArrayList<AddBook> bookList = new ArrayList<>();
        while (true) {
            System.out.println("1 Add a Book");
            System.out.println("2 List of Books");
            System.out.println("3 Issue a Book");
            System.out.println("4 Delete a Book");
            System.out.println("5 Return Book");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (choice == 1) {
                System.out.println("Enter the title of the book:");
                String title = scanner.nextLine();
                System.out.println("Enter the author of the book:");
                String author = scanner.nextLine();
                System.out.println("Enter the ID of the book:");
                String Id = scanner.nextLine();

                AddBook book = new AddBook(title, author, Id); // object of AddBook
                bookList.add(book); // add book in the list
                book.displayBookDetails(); // display book details
                System.out.println("Book added successfully!");
            } else if (choice == 2) {
                System.out.println("List of Books:");
                if (bookList.isEmpty()) {
                    System.out.println("No books available.");

                } else {
                    System.out.println("Books available in the library:");
                }
                for (AddBook book : bookList) {
                    book.displayBookDetails();

                }
                System.out.println("Total number of books: " + bookList.size());

            } else if (choice == 3) {

                System.out.println("Enter the id of book to Issue");
                String id = scanner.nextLine();
                boolean found = false;
                for (AddBook book : bookList) {
                    if (book.Id.equals(id)) {
                        book.isIssued = true;
                        System.out.println("Book with ID: " + id + " has been issued.");
                        book.displayBookDetails();
                        found = true;
                    } else {
                        System.out.println("Book not found with ID: " + id);
                        found = false;
                    }

                }
            } else if (choice == 4) {
                System.out.println("Enter the id of book you want to delete");
                String id = scanner.nextLine();
                boolean found = false;
                Iterator<AddBook> iterator = bookList.iterator();
                while (iterator.hasNext()) {
                    AddBook book = iterator.next();
                    if (book.Id.equals(id)) {
                        iterator.remove(); // Remove the book using iterator
                        System.out.println("Book with ID: " + id + " has been deleted successfully.");
                        found = true;
                        break; // Exit the loop after deletion
                    }
                }

            } else if (choice == 5) {
                System.out.println("Enter the id of book to return");
                String id = scanner.nextLine();
                boolean found = false;
                for (AddBook book : bookList) {
                    if (book.Id.equals(id)) {
                        if (book.isIssued) {
                            book.isIssued = false;
                            found = true;
                            book.displayBookDetails();
                            System.out.println(id + "Book Returned Successfully");
                        } else {
                            System.out.println("Book with ID: " + id + " was not issued.");
                        }
                        found = false;
                        break;

                    }
                }
            }

            else if (choice < 1 || choice > 5) {
                System.out.println("Invalid Choice!! ");
            }

        }

    }

}
