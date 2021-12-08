package MiniTest.View;

import MiniTest.Controller.TeacherController;
import MiniTest.Model.Student;
import MiniTest.Model.Teacher;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class TeacherView {
    Scanner scanner = new Scanner(System.in);
    TeacherController teacherController = new TeacherController();
    List<Teacher> teacherList = teacherController.showListTeacher();
    boolean isValidNumber;

    public TeacherView() throws IOException {
    }

    public void viewShowListTeacher() throws IOException {
        System.out.println("----Teachers List---");
        System.out.println(teacherList);
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

    public void viewCreateTeacher() throws IOException {
        while(true) {
            System.out.println("Enter the name of Teacher: ");
            String name = scanner.nextLine();
            System.out.println("Enter the age of Teacher: ");
            int age = checkValidNumber();
            System.out.println("Enter the salary of Teacher: ");
            int salary = checkValidNumber();
            Teacher teacher = new Teacher(name, age, salary);
            teacherController.createTeacher(teacher);
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

    public void deleteTeachertByName() throws IOException {
        while (true) {
            System.out.println("Enter teacher's name:");
            String name = scanner.nextLine();
            for (int i = 0; i < teacherController.showListTeacher().size(); i++) {
                if (name.equals(teacherController.showListTeacher().get(i).getName())) {
                    System.out.println("Name " + teacherList.get(i).getName() + " ,"
                            + "Age " + teacherList.get(i).getAge() + " ,"
                            + "Salary " + teacherList.get(i).getSalary() + " ,");
                    System.out.println("Tye -yes to confirm delete or -quit to back to Menu");
                    String typeConfirm;
                    do {
                        typeConfirm = scanner.nextLine();
                        if (typeConfirm.equals("yes")) {
                            teacherController.deleteTeacherByName(i);
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

    public void sumOfTeacherAverageSalaryOfYear() throws IOException {
        int sum = teacherController.sumOfTeacherAverageSalaryOfYear();
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
