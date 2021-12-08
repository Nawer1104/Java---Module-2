package MiniTest.Service.TeacherManagement;

import MiniTest.Model.Student;
import MiniTest.Model.Teacher;

import java.io.IOException;
import java.util.List;

public interface ITeacherManagement {
    List<Teacher> showAll() throws IOException;
    void remove(int index);
    void add(Teacher teacher) throws IOException;
    int avgSalaryOfYear();
}
