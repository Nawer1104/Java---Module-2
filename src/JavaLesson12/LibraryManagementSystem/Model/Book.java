package JavaLesson12.LibraryManagementSystem.Model;

public class Book {
    private int id;
    private String name;
    private String author;
    private static int idNumber = 1;

    public Book(String name, String author) {
        this.id = idNumber++;
        this.name = name;
        this.author = author;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
