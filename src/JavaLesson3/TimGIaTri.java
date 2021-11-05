package JavaLesson3;

import java.util.Scanner;

public class TimGIaTri {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name of student: ");
        String name = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)){
                isExist = true;
                System.out.println("Position of the students in the list " + name + " is " + (i + 1));
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found " + name + " in the list");
        }
    }
}
