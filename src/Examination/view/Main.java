package Examination.view;

import Examination.service.StudentManagement;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    StudentView studentView = new StudentView();
    boolean isValidNumber;

    public Main() {
        do {
            isValidNumber = true;
            System.out.println("------------------------------------------------------------");
            System.out.println("|---              STUDENT MANAGEMENT SYSTEM             ---|");
            System.out.println("------------------------------------------------------------");
            System.out.println("|1. Show student list                                       |");
            System.out.println("|2. Add new student to the list                             |");
            System.out.println("|3. Edit student detail by Id                               |");
            System.out.println("|4. Remove student by Id                                    |");
            System.out.println("|5. Sort student list                                       |");
            System.out.println("|6. Exit System                                             |");
            System.out.println("\\___________________________________________________________/");
            System.out.print("Make your choice: ");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        studentView.showList();
                        break;
                    case 2:
                        studentView.addStudent();
                        break;
                    case 3:
                        studentView.editStudent();
                        break;
                    case 4:
                        studentView.removeStudentById();
                        break;
                    case 5:
                        studentView.sortList();
                        break;
                    case 6:
                        System.exit(0);
                        break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Input number incorrect!!");
                isValidNumber = false;
            }
        } while (!isValidNumber);
    }

    public static void main(String[] args) {
        new Main();
    }
}
