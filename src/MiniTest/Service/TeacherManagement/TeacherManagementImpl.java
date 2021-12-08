package MiniTest.Service.TeacherManagement;

import MiniTest.IOFile.IOFile;
import MiniTest.Model.Student;
import MiniTest.Model.Teacher;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TeacherManagementImpl implements ITeacherManagement{
    public String PATH = "C:\\Users\\hihih\\IdeaProjects\\Demo\\src\\MiniTest\\TeacherList.txt";
    IOFile<Teacher> ioFile = new IOFile<>();
    List<Teacher> teacherList = new ArrayList<>();

    @Override
    public List<Teacher> showAll() throws IOException {
        ioFile.readFileData(PATH);
        return teacherList;
    }

    @Override
    public void remove(int index) {
        teacherList.remove(index);
    }

    @Override
    public void add(Teacher teacher) throws IOException {
        List<Teacher> teachers;
        if (checkFile()) {
            teachers = teacherList;
        } else {
            teachers = showAll();
        }
        teachers.add(teacher);
        ioFile.writerFileData(teachers, PATH);
    }

    @Override
    public int avgSalaryOfYear() {
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < teacherList.size(); i++) {
            sum += teacherList.get(i).getSalary();
        }
        avg = sum/teacherList.size();
        return avg;
    }
    public boolean checkFile() throws IOException {
        List<Teacher> teacherList1 = showAll();
        return teacherList1 == null;
    }

}
