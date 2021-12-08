package MiniTest.View;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    StudentView studentView = new StudentView();
    TeacherView teacherView = new TeacherView();
    Scanner scanner = new Scanner(System.in);
    boolean isValidNumber;
    public Menu() throws IOException {
        do {
            isValidNumber = true;
            System.out.println("Menu teachers and students management system:");
            System.out.println("1. Manage students list:");
            System.out.println("2. Manage teacher list:");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        studentsManage();
                        break;
                    case 2:
                        teachersManage();
                        break;
                    default:
                        System.err.println("Number incorrect!!");
                        new Menu();
                }
            } catch (NumberFormatException | IOException e) {
                System.err.println("Number incorrect!!");
                isValidNumber = false;
            }
        } while (!isValidNumber);
    }

    public void studentsManage() throws IOException {
        do {
            isValidNumber = true;
            System.out.println("Menu students management system:");
            System.out.println("1. Show all students list:");
            System.out.println("2. Add students:");
            System.out.println("3. Delete students :");
            System.out.println("4. Sum of student's avg score:");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        studentView.viewShowListStudent();
                        break;
                    case 2:
                        studentView.viewCreateStudent();
                        break;
                    case 3:
                        studentView.deleteStudentByName();
                        break;
                    case 4:
                        studentView.sumOfStudentAvgScore();
                        break;
                    default:
                        System.err.println("Number incorrect!!");
                        new Menu();
                }
            } catch (NumberFormatException e) {
                System.err.println("Number incorrect!!");
                isValidNumber = false;
            }
        } while (!isValidNumber);
    }


    public void teachersManage() throws IOException {
        do {
            isValidNumber = true;
            System.out.println("Menu teachers management system:");
            System.out.println("1. Show all teachers list:");
            System.out.println("2. Add teacher:");
            System.out.println("3. Delete teacher:");
            System.out.println("4. Average teacher's salary of year:");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        teacherView.viewShowListTeacher();
                        break;
                    case 2:
                        teacherView.viewCreateTeacher();
                        break;
                    case 3:
                        teacherView.deleteTeachertByName();
                        break;
                    case 4:
                        teacherView.sumOfTeacherAverageSalaryOfYear();
                        break;
                    default:
                        System.err.println("Number incorrect!!");
                        new Menu();
                }
            } catch (NumberFormatException e) {
                System.err.println("Number incorrect!!");
                isValidNumber = false;
            }
        } while (!isValidNumber);
    }


    public static void main(String[] args) throws IOException {
        new Menu();
    }
}
