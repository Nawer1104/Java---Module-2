package JavaLesson12.LibraryManagementSystem.View;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    BookView studentView = new BookView();

    public Menu() {
        System.out.println("MENU LIBRARY MANAGEMENT SYSTEM");
        System.out.println("1. Create New Book");
        System.out.println("2. Show Books List");
        System.out.println("3. Delete Book by Id");
        System.out.println("4. Find Book Detail by Id");

        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                studentView.createNewBook();
                break;
            case 2:
                studentView.showBookList();
                break;
            case 3:
                studentView.deleteBookList();
                break;
            case 4:
                studentView.findBookDetailById();
                break;
        }
    }

    public static void main(String[] args) {
        new Menu();
    }
}
