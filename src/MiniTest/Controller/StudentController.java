package MiniTest.Controller;

import MiniTest.Model.Student;
import MiniTest.Service.StudentManagement.StudentManagementImpl;
import org.apache.groovy.json.internal.IO;

import java.io.IOException;
import java.util.List;

public class StudentController {
    StudentManagementImpl studentManagement = new StudentManagementImpl();

    public List<Student> showListStudent() throws IOException {
        return studentManagement.showAll();
    }


    public void createStudent(Student student) throws IOException {
        studentManagement.add(student);
    }

    public void deleteStudentByName(int index) throws IOException {
        studentManagement.remove(index);
    }

    public int sumOfStudentAvgScore() throws IOException {
        return studentManagement.sumAvg();
    }


}
