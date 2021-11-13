package BOOKMANAGEMENTSYSTEM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] book = new Book[1];
        book[0] = new Book("Introduction", "English", "Nawer", 2016, 1);


        while (true) {
            System.out.println("Welcome to the library");
            System.out.println("1: Add some books. ");
            System.out.println("2: Book remove.");
            System.out.println("3: Update information.");
            System.out.println("4: Search");
            System.out.println("5: Sort");
            System.out.println("6: Show");
            System.out.println("0: Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    book = add(book);
                    break;
                case 2:
                    book = remove(book);
                    break;
                case 3:
                    book = update(book);
                    break;
                case 4:
                    search(book);
                    break;
                case 5:
                    sort(book);
                    show(book);
                    break;
                case 6:
                    show(book);
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }

    public static void show(Book[] book) {
        for (Book x: book
             ) {
            System.out.println(x.toString());
        }
    }

    public static Book[] add(Book[] book) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the book: ");
        String name = scanner.nextLine();
        System.out.println("Written by Language: ");
        String language = scanner.nextLine();
        System.out.println("Written by who?");
        String author = scanner.nextLine();
        System.out.println("Created when?");
        int createTime = scanner.nextInt();
        System.out.println("Books quantity");
        int quantity = scanner.nextInt();

        Book book1 = new Book(name, language, author, createTime, quantity);

        Book[] newBook = new Book[book.length +1];

        for (int i = 0; i < book.length; i++) {
            newBook[i] = book[i];
        }

        newBook[book.length] = book1;

        for (Book x: newBook
             ) {
            System.out.println(x.toString());
        }

        return newBook;
    }

    public static Book[] remove(Book[] book) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of book's id:");
        int id = scanner.nextInt();
        int index = 0;

        for (int i = 0; i < book.length; i++) {
            if (id == book[i].getId()) {
                index = i;
                break;
            }
        }

        Book[] newBook = new Book[book.length - 1];

        for (int i = index; i < book.length - 1; i++) {
            book[i] = book[i + 1];
        }

        for (int i = 0; i < newBook.length; i++) {
            newBook[i] = book[i];
        }

        for (Book x: newBook
             ) {
            System.out.println(x.toString());
        }

        return newBook;
    }

    public static Book[] update(Book[] book) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of book's id:");
        int id = scanner.nextInt();
        System.out.println("Which option you want to update: ");
        scanner.nextLine();
        String option = scanner.nextLine();

        for (int i = 0; i < book.length; i++) {
            if ( id == book[i].getId()) {
                if (option.equals("name")) {
                    System.out.println("Name of the book: ");
                    String name = scanner.nextLine();
                    book[i].setName(name);
                }
                if (option.equals("quantity")) {
                    System.out.println("Quantity of the book: ");
                    int quantity = scanner.nextInt();
                    book[i].setQuantity(quantity);
                }
                if (option.equals("language")) {
                    System.out.println("Book's language: ");
                    String language = scanner.nextLine();
                    book[i].setLanguage(language);
                }
                if (option.equals("author")) {
                    System.out.println("Author of the book: ");
                    String author = scanner.nextLine();
                    book[i].setAuthor(author);
                }
                if (option.equals("time")) {
                    System.out.println("Year?: ");
                    int createTime = scanner.nextInt();
                    book[i].setCreateTime(createTime);
                }
            }
        }
        Book[] newBook = new Book[book.length];

        for (int i = 0; i < book.length; i++) {
            newBook[i] = book[i];
        }

        for (Book x: newBook
        ) {
            System.out.println(x.toString());
        }

        return newBook;
    }

    public static void search(Book[] book) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What are you looking for?");
        String name = scanner.nextLine();

        boolean check = false;

        for (int i = 0; i < book.length; i++) {
            if (name.equals(book[i].getName())) {
                System.out.println(book[i]);
                check = true;
            } else {
                check = false;
            }
        }
        if (!check) {
            System.out.println("Can not find you book");
        }
    }

    public static void sort(Book[] book) {
        Book temp;
        for (int i = 0; i < book.length-1; i++) {
            for (int j = i + 1; j < book.length; j++) {
                if (book[i].getQuantity() > book[j].getQuantity()){
                    temp = book[j];
                    book[j] = book[i];
                    book[i] = temp;
                }
            }
        }
    }
}
