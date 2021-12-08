package MiniTest.Service.StudentManagement;

import MiniTest.IOFile.IOFile;
import MiniTest.Model.Student;
import MiniTest.Model.Teacher;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentManagementImpl implements IStudentManagement {
    public String PATH = "C:\\Users\\hihih\\IdeaProjects\\Demo\\src\\MiniTest\\StudentList.txt";
    IOFile<Student> ioFile = new IOFile<>();
    public static List<Student> studentList = new ArrayList<>();

    @Override
    public List<Student> showAll() throws IOException {
        studentList = ioFile.readFileData(PATH);
        return studentList;
    }

    @Override
    public void remove(int index) {
        studentList.remove(index);
    }

    @Override
    public void add(Student student) throws IOException {
        List<Student> students;
        if (checkFile()) {
            students = studentList;
        } else {
            students = showAll();
        }
        studentList.add(student);
        ioFile.writerFileData(students, PATH);
    }

    @Override
    public int sumAvg() {
        int sum = 0;
        for (Student student : studentList
             ) {
            sum += student.getAvg();
        }
        return sum;
    }

    public boolean checkFile() throws IOException {
        List<Student> studentList1 = showAll();
        return studentList1 == null;
    }

    public static void main(String[] args) throws IOException {
        StudentManagementImpl studentManagement = new StudentManagementImpl();
        System.out.println(studentManagement.showAll());
    }
}
