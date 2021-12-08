package MiniTest.Service.StudentManagement;

import MiniTest.Model.Human;
import MiniTest.Model.Student;

import java.io.IOException;
import java.util.List;

public interface IStudentManagement {
    List<Student> showAll() throws IOException;
    void remove(int index);
    void add(Student student) throws IOException;
    int sumAvg();

}
