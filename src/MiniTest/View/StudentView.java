package MiniTest.View;

import MiniTest.Controller.StudentController;
import MiniTest.Controller.TeacherController;
import MiniTest.Model.Student;
import MiniTest.Service.StudentManagement.StudentManagementImpl;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class StudentView {
    Scanner scanner = new Scanner(System.in);
    StudentController studentController = new StudentController();
    List<Student> studentList = studentController.showListStudent();
    boolean isValidNumber;

    public StudentView() throws IOException {
    }

    public void viewShowListStudent() throws IOException {
        System.out.println("----Student List---");
        System.out.println(studentList);
        String typeToExit;
        do {
            System.out.println("Type -quit to back to Menu");
            typeToExit = scanner.next();
            if (typeToExit.equalsIgnoreCase("quit")) {
                new Menu();
            }
        } while (!(typeToExit.equals("quit")));
    }

    public int checkValidNumber() {
        int value = -1;
        do {
            isValidNumber = true;
            try {
                value = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Wrong input, must be number!!");
                System.out.println("Enter again:");
                isValidNumber = false;
            }
        } while (!isValidNumber);
        return value;
    }

    public void  viewCreateStudent() throws IOException {
        while(true) {
            System.out.println("Enter the name of Student: ");
            String name = scanner.nextLine();
            System.out.println("Enter the age of Student: ");
            int age = checkValidNumber();
            System.out.println("Enter the average score of Student: ");
            int avg = checkValidNumber();
            Student student = new Student(name, age, avg);
            studentController.createStudent(student);
            System.out.println("Created success");
            String typeToExit;
            do {
                System.out.println("Type -quit to back to Menu");
                typeToExit = scanner.next();
                if (typeToExit.equalsIgnoreCase("quit")) {
                    new Menu();
                }
            } while (!(typeToExit.equals("quit")));
        }
    }

    public void deleteStudentByName() throws IOException {
        while (true) {
            System.out.println("Enter student's name:");
            String name = scanner.nextLine();
            for (int i = 0; i < studentController.showListStudent().size(); i++) {
                if (name.equals(studentController.showListStudent().get(i).getName())) {
                    System.out.println("Name " + studentList.get(i).getName() + " ,"
                            + "Age " + studentList.get(i).getAge() + " ,"
                            + "Avg " + studentList.get(i).getAvg() + " ,");
                    System.out.println("Tye -yes to confirm delete or -quit to back to Menu");
                    String typeConfirm;
                    do {
                        typeConfirm = scanner.nextLine();
                        if (typeConfirm.equals("yes")) {
                            studentController.deleteStudentByName(i);
                            System.out.println("Deleted success");
                            String typeToExit;
                            do {
                                System.out.println("Type -quit to back to Menu");
                                typeToExit = scanner.next();
                                if (typeToExit.equalsIgnoreCase("quit")) {
                                    new Menu();
                                }
                            } while (!(typeToExit.equals("quit")));
                        } else {
                            System.err.println("Wrong input!!!");
                            System.out.println("Enter again:");
                        }
                    } while (!typeConfirm.equals("yes"));
                } else {
                    System.err.println("Wrong input!!!");
                    System.out.println("Enter again:");
                }
            }
        }
    }

    public void sumOfStudentAvgScore () throws IOException {
        int sum = studentController.sumOfStudentAvgScore();
        System.out.println("Sum = " + sum);
        String typeToExit;
        do {
            System.out.println("Type -quit to back to Menu");
            typeToExit = scanner.next();
            if (typeToExit.equalsIgnoreCase("quit")) {
                new Menu();
            }
        } while (!(typeToExit.equals("quit")));
    }
}
