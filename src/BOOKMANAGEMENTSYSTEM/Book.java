package BOOKMANAGEMENTSYSTEM;

public class Book {
    private int id;
    private String name;
    private int quantity;
    private String language;
    private String author ;
    private int createTime;

    private static int idNumber = 1;

    public Book(String name, String language, String author, int createTime, int quantity) {
        this.id = idNumber++;
        this.name = name;
        this.quantity = quantity;
        this.language = language;
        this.author = author;
        this.createTime = createTime;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getLanguage() {
        return language;
    }

    public String getAuthor() {
        return author;
    }

    public int getCreateTime() {
        return createTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCreateTime(int createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", language='" + language + '\'' +
                ", author='" + author + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
