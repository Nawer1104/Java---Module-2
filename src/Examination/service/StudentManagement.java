package Examination.service;

import Examination.model.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentManagement {
    static List<Student> studentList = new ArrayList<>();
    static String filePatch = "studentslist.txt";

    public List<Student> getList() {
        return studentList = readFile();
    }

    public void addStudent(Student student) {
        getList();
        studentList.add(student);
        writeToFile();
    }

    public void removeStudent(int index) {
        getList();
        getList().remove(index);
        writeToFile();
    }

    public Student getStudentByIndex(int index) {
        return getList().get(index);
    }

    public void setStudent (int index, Student student) {
        studentList.set(index, student);
    }

    public void sortListFromLower () {
        Collections.sort(getList(), new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getGpa() < o2.getGpa()) {
                    return -1;
                } else {
                    if (o1.getGpa() == o2.getGpa()) {
                        return 0;
                    } else {
                        return 1;
                    }
                }
            }
        });
        writeToFile();
    }

    public void sortListFromHigher () {
        Collections.sort(getList(), new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getGpa() < o2.getGpa()) {
                    return 1;
                } else {
                    if (o1.getGpa() == o2.getGpa()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
        writeToFile();
    }

    public List<Student> readFile() {
        List<Student> newStudentList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filePatch);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
                String students[] = line.split(",");
                Student newStudent = new Student(Integer.parseInt(students[0]), students[1], Integer.parseInt(students[2]), students[3], students[4], Double.parseDouble(students[5]));
                newStudentList.add(newStudent);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return newStudentList;
    }

    public void writeToFile() {
        try {
            FileWriter fileWriter = new FileWriter(filePatch);
            for (Student x : studentList) {
                String studentLine = x.getId() + ","
                        + x.getName() + ","
                        + x.getAge() + ","
                        + x.getGender() + ","
                        + x.getAddress() + ","
                        + x.getGpa() + "\n";
                fileWriter.write(studentLine);
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
