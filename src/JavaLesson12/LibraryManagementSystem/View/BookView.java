package JavaLesson12.LibraryManagementSystem.View;

import JavaLesson12.LibraryManagementSystem.Controller.BookController;
import JavaLesson12.LibraryManagementSystem.Model.Book;

import java.util.Scanner;

public class BookView {
    Scanner scanner = new Scanner(System.in);
    BookController bookController = new BookController();

    public void createNewBook() {
        while (true) {
            System.out.println("Enter book's name:");
            String name = scanner.nextLine();
            System.out.println("Enter book's author:");
            String author = scanner.nextLine();
            Book book = new Book(name, author);
            bookController.add(book);
            System.out.println("Created success");
            System.out.println("Press any key to continue or type -quit to exit to Menu");
            String typeToExit = scanner.next();
            if (typeToExit.equalsIgnoreCase("quit")) {
                new Menu();
            }
        }
    }

    public void showBookList() {
        System.out.println("STT---BOOK'S NAME---AUTHOR");
        System.out.println("Size : " + bookController.show().size());
        for (int i = 0; i < bookController.show().size(); i++) {
            System.out.println(" " + bookController.show().get(i).getId()
                    + "---" + bookController.show().get(i).getName()
                    + "---" + bookController.show().get(i).getAuthor());
        }
        System.out.println("Type -quit to back to Menu");
        String typeToExit = scanner.next();
        if (typeToExit.equalsIgnoreCase("quit")) {
            new Menu();
        }
    }

    public void deleteBookList() {
        while (true) {
            System.out.println("Enter Book's Id number:");
            int id = Integer.parseInt(scanner.nextLine());
            bookController.deleteBookById(id);
            System.out.println("Deleted success");
            System.out.println("Press any key to continue of type -quit to back to Menu");
            String typeToExit = scanner.next();
            if (typeToExit.equalsIgnoreCase("quit")) {
                new Menu();
            }
        }
    }

    public Book findBookDetailById() {
        while (true) {
            System.out.println("Enter Book's Id number:");
            int id = Integer.parseInt(scanner.nextLine());
            Book book = bookController.findBookDetailById(id);
            System.out.println("  " + book.getId()
                    + "---" + book.getName()
                    + "---" + book.getAuthor());
            System.out.println("Press any key to continue of type -quit to back to Menu");
            String typeToExit = scanner.next();
            if (typeToExit.equalsIgnoreCase("quit")) {
                new Menu();
            }
        }
    }
}
