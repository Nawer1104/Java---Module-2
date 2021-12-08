package Examination.view;

import Examination.model.Student;
import Examination.service.StudentManagement;

import java.util.Scanner;

public class StudentView {
    Scanner scanner = new Scanner(System.in);
    StudentManagement studentManagement = new StudentManagement();
    boolean isValidNumber;

    public void showList() {
        int count = -1;
        System.out.println("-----------------------------------------------------");
        System.out.println("----{  ID---NAME---AGE---GENDER---ADDRESS---GPA  }---");
        System.out.println("-----------------------------------------------------");
        System.out.println("Size :" + studentManagement.getList().size());
        System.out.println("Press Enter to show 5 student each time: ");
        for (int i = 0; i < studentManagement.getList().size(); i++) {
            count++;
            if (count % 5 == 0) {
                System.out.println("--------------------------------");
                scanner.nextLine();
            }
            System.out.println("     " + studentManagement.getList().get(i).getId()
                    + "---" + studentManagement.getList().get(i).getName()
                    + "---" + studentManagement.getList().get(i).getAge()
                    + "---" + studentManagement.getList().get(i).getGender()
                    + "---" + studentManagement.getList().get(i).getAddress()
                    + "---" + studentManagement.getList().get(i).getGpa()
            );
        }
        String typeToExit;
        do {
            System.out.println("Type -quit to back to Menu");
            typeToExit = scanner.next();
            if (typeToExit.equalsIgnoreCase("quit")) {
                new Main();
            }
        } while (!(typeToExit.equals("quit")));
    }

    public int checkValidInteger() {
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

    public double checkValidDouble() {
        double value = -1;
        do {
            isValidNumber = true;
            try {
                value = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Wrong input, must be number!!");
                System.out.println("Enter again:");
                isValidNumber = false;
            }
        } while (!isValidNumber);
        return value;
    }

    public boolean isIdExist(int id) {
        for (int i = 0; i < studentManagement.getList().size(); i++) {
            if (id == studentManagement.getList().get(i).getId()) {
                return true;
            }
        }
        return false;
    }

    public void addStudent() {
        while (true) {
            System.out.println("---------------------------------------");
            System.out.println("----{  ADDING STUDENT TO THE LIST  }---");
            System.out.println("---------------------------------------");
            System.out.println("Enter student's id, id must not equal or less than 0 and be duplicated:");
            int id = checkValidInteger();
            while (id <= 0 || isIdExist(id)) {
                System.err.println("Re-enter student's id again:");
                id = checkValidInteger();
            }
            System.out.println("Enter student's name:");
            String name = scanner.nextLine();
            System.out.println("Enter student's age:");
            int age = checkValidInteger();
            System.out.println("Enter student's gender:");
            String gender = scanner.nextLine();
            System.out.println("Enter student's address:");
            String address = scanner.nextLine();
            System.out.println("Enter student's gpa:");
            double gpa = checkValidDouble();
            Student student = new Student(id, name, age, gender, address, gpa);
            studentManagement.addStudent(student);
            String typeToExit;
            System.out.println("Created success");
            do {
                System.out.println("Type -quit to back to Menu");
                typeToExit = scanner.next();
                if (typeToExit.equalsIgnoreCase("quit")) {
                    new Main();
                }
            } while (!(typeToExit.equals("quit")));
        }
    }

    public int getIndexById(int id) {
        for (int i = 0; i < studentManagement.getList().size(); i++) {
            if (id == studentManagement.getList().get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    public void editStudent() {
        while (true) {
            System.out.println("Enter student's Id number:");
            int id = checkValidInteger();
            int index = getIndexById(id);
            if (index != -1) {
                Student student = studentManagement.getStudentByIndex(index);
                System.out.println("----------------------------------------------");
                System.out.println("----{  ARE YOU LOOKING FOR THIS STUDENT?  }---");
                System.out.println("----------------------------------------------");
                System.out.println("Student's id :" + student.getId() + "\n"
                        + "Student's name: " + student.getName() + "\n"
                        + "Student's age: " + student.getAge() + "\n"
                        + "Student's gender: " + student.getGender() + "\n"
                        + "Student's address: " + student.getAddress() + "\n"
                        + "Student's gpa: " + student.getGpa()
                );
                System.out.println("------------------------------------------------------------------------");
                System.out.println("----------{             LET'S MAKE SOMETHING SPECIAL        }-----------");
                System.out.println("------------------------------------------------------------------------");
                System.out.println("Enter student's id, id must not equal or less than 0 and be duplicated:");
                int newId = checkValidInteger();
                while (newId <= 0 || isIdExist(newId)) {
                    System.err.println("Re-enter student's id again:");
                    newId = checkValidInteger();
                }
                System.out.println("Enter student's name:");
                String newName = scanner.nextLine();
                System.out.println("Enter student's age:");
                int newAge = checkValidInteger();
                System.out.println("Enter student's gender:");
                String newGender = scanner.nextLine();
                System.out.println("Enter student's address:");
                String newAddress = scanner.nextLine();
                System.out.println("Enter student's gpa:");
                double newGpa = checkValidDouble();
                student.setId(newId);
                student.setName(newName);
                student.setAge(newAge);
                student.setAddress(newAddress);
                student.setGender(newGender);
                student.setGpa(newGpa);
                studentManagement.setStudent(index, student);
                studentManagement.writeToFile();
                System.out.println("Edit success");
                String typeToExit;
                do {
                    System.out.println("Type -quit to back to Menu");
                    typeToExit = scanner.next();
                    if (typeToExit.equalsIgnoreCase("quit")) {
                        new Main();
                    }
                } while (!(typeToExit.equals("quit")));
            } else {
                System.err.println("Wrong input. Enter student's id again :");
            }
        }
    }

    public boolean checkList() {
        return studentManagement.getList().size() > 0;
    }

    public void removeStudentById() {
        while (true) {
            if (checkList()) {
                System.out.println("Enter student's Id number:");
                int id = checkValidInteger();
                int index = getIndexById(id);
                if (index != -1) {
                    System.out.println("Type -yes to confirm delete, Type anything to back to Menu");
                    String typeConfirm;
                    typeConfirm = scanner.nextLine();
                    if (typeConfirm.equals("yes")) {
                        studentManagement.removeStudent(index);
                        System.out.println("Deleted success");
                        System.out.println("Back to Main Menu");
                        new Main();
                    } else {
                        new Main();
                    }
                } else {
                    System.err.println("Wrong input. Enter student's id again :");
                }
            }
        }
    }

    public void sortList() {
        System.out.println("------SORT STUDENT LIST BY GPA------");
        System.out.println("Make your choice:");
        System.out.println("1. From lower to higher");
        System.out.println("2. From higher to lower");
        System.out.println("3. Quit to Menu");
        System.out.println("-------------------------------------");

        int choice = checkValidInteger();
        while (true) {
            switch (choice) {
                case 1:
                    studentManagement.sortListFromLower();
                    System.out.println("Sort success");
                    studentManagement.writeToFile();
                    break;
                case 2:
                    studentManagement.sortListFromHigher();
                    System.out.println("Sort success");
                    studentManagement.writeToFile();
                    break;
                case 3:
                    new Main();
                    break;
                default:
                    System.err.println("Wrong input! Re-enter again:");
            }
        }
    }
}
