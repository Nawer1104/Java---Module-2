package JavaLesson12.LibraryManagementSystem.Service;

import JavaLesson12.LibraryManagementSystem.Model.Book;

import java.util.List;

public interface IManagementSystem {
    List<Book> show();
    void add(Book book);
    void deleteById(int id);
    Book findBookDetailById (int id);
}
