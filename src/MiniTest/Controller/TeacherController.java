package MiniTest.Controller;

import MiniTest.Model.Student;
import MiniTest.Model.Teacher;
import MiniTest.Service.TeacherManagement.TeacherManagementImpl;

import java.io.IOException;
import java.util.List;

public class TeacherController {
    TeacherManagementImpl teacherManagement = new TeacherManagementImpl();

    public List<Teacher> showListTeacher() throws IOException {
        return teacherManagement.showAll();
    }


    public void createTeacher(Teacher teacher) throws IOException {
        teacherManagement.add(teacher);
    }

    public void deleteTeacherByName(int index) throws IOException {
        teacherManagement.remove(index);
    }

    public int sumOfTeacherAverageSalaryOfYear() throws IOException {
        return teacherManagement.avgSalaryOfYear();
    }
}
