package JavaLesson12.LibraryManagementSystem.Service;

import JavaLesson12.LibraryManagementSystem.Model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookManagementImpl implements IManagementSystem {
    public static List<Book> bookList = new ArrayList<>();

    static {
        bookList.add(new Book("Call of the wind", "John Snow"));
        bookList.add(new Book("Finding Nemo", "John Witch"));
        bookList.add(new Book("Who killed my dog", "Tom"));
    }

    @Override
    public List<Book> show() {
        return bookList;
    }

    @Override
    public void add(Book book) {
        bookList.add(book);
    }

    @Override
    public void deleteById(int id) {
        bookList.remove(id - 1);
    }

    @Override
    public Book findBookDetailById(int id) {
        return bookList.get(id - 1);
    }
}
