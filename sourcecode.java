import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManagementSystem {

    static Scanner scanner = new Scanner(System.in);
    static List<Book> books = new ArrayList<>();

    static class Book {
        String id;
        String title;
        String author;
        boolean issued;

        Book(String id, String title, String author, boolean issued) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.issued = issued;
        }
    }

    public static void main(String[] args) {
        addInitialBooks();
        menu();
        scanner.close();
    }

    static void addInitialBooks() {
        books.add(new Book("1", "The Wimpikid", "Harper Lee", false));
        books.add(new Book("2", "J", "George Orwell", false));
        books.add(new Book("3", "Pride and Prejudice", "Jane Austen", true));
        books.add(new Book("4", "The Great Gatsby", "F. Scott Fitzgerald", false));
        books.add(new Book("5", "Moby Dick", "Herman Melville", true));
        books.add(new Book("6", "The Catcher in the Rye", "J.D. Salinger", false));
        books.add(new Book("7", "Brave New World", "Aldous Huxley", false));
        books.add(new Book("8", "The Hobbit", "J.R.R. Tolkien", true));
        books.add(new Book("9", "The Odyssey", "Homer", false));
        books.add(new Book("10", "The Alchemist", "Paulo Coelho", false));
    }

    static void addBook() {
        System.out.println("\n--- Add a New Book ---");

        System.out.print("Enter Book ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Book Author: ");
        String author = scanner.nextLine();

        books.add(new Book(id, title, author, false));

        System.out.println(
                "Book '" + title + "' by " + author +
                " (ID: " + id + ") added to the library."
        );
    }

    static void displayBooks() {
        System.out.println("\n--- Library Books ---");

        if (books.isEmpty()) {
            System.out.println("No books in the library yet.");
            return;
        }

        for (Book book : books) {
            String status = book.issued ? "Issued" : "Available";

            System.out.println(
                    "ID: " + book.id +
                    "\tTitle: " + book.title +
                    "\tAuthor: " + book.author +
                    "\tStatus: " + status
            );
        }
    }

    static void issueBook() {
        System.out.println("\n--- Issue a Book ---");
        System.out.print("Enter the Book ID to issue: ");
        String bookId = scanner.nextLine();

        for (Book book : books) {
            if (book.id.equals(bookId)) {
                if (!book.issued) {
                    book.issued = true;
                    System.out.println(
                            "The book '" + book.title +
                            "' written by " + book.author +
                            " has been issued."
                    );
                } else {
                    System.out.println("Sorry, that book is already issued.");
                }
                return;
            }
        }

        System.out.println("Sorry, book not found in the library.");
    }

    static void returnBook() {
        System.out.println("\n--- Return a Book ---");
        System.out.print("Enter the Book ID to return: ");
        String bookId = scanner.nextLine();

        for (Book book : books) {
            if (book.id.equals(bookId)) {
                if (book.issued) {
                    book.issued = false;
                    System.out.println(
                            "Thank you for returning '" + book.title + "'."
                    );
                } else {
                    System.out.println("This book is not currently issued.");
                }
                return;
            }
        }

        System.out.println("Book not found in the library.");
    }

    static void menu() {
        while (true) {
            System.out.println("\n*** Library Management System ***");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addBook();
                    break;

                case "2":
                    displayBooks();
                    break;

                case "3":
                    issueBook();
                    break;

                case "4":
                    returnBook();
                    break;

                case "5":
                    System.out.println("Thank you. Have a nice day!");
                    return;

                default:
                    System.out.println(
                            "Incorrect choice. Enter a number from 1 to 5."
                    );
            }
        }
    }
}
