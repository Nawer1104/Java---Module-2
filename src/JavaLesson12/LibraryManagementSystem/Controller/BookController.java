package JavaLesson12.LibraryManagementSystem.Controller;

import JavaLesson12.LibraryManagementSystem.Model.Book;
import JavaLesson12.LibraryManagementSystem.Service.BookManagementImpl;

import java.util.List;

public class BookController {
    BookManagementImpl bookManagement = new BookManagementImpl();

    public List<Book> show() {
        return bookManagement.show();
    }

    public void add(Book book) {
        bookManagement.add(book);
    }

    public void deleteBookById(int id) {
        bookManagement.deleteById(id);
    }

    public Book findBookDetailById (int id) {
       return bookManagement.findBookDetailById(id);
    }
}
