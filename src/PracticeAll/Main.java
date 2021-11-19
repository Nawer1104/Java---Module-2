package PracticeAll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Management management = new Management();

        while (true) {
            System.out.println("Students Management System:");
            System.out.println("1.Show all students");
            System.out.println("2.Add student");
            System.out.println("3.Remove student by id");
            System.out.println("4.Edit student's information");
            System.out.println("5.Search student by name");
            System.out.println("6.Sort student list by average score");
            System.out.println("7.Sum of student's average score");
            System.out.println("0.Exit");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    management.show();
                    break;
                case 2:
                    management.add();
                    break;
                case 3:
                    management.remove();
                    break;
                case 4:
                    management.edit();
                    break;
                case 5:
                    management.search();
                    break;
                case 6:
                    management.sort();
                    break;
                case 7:
                    System.out.println("Sum of student's average score is: ");
                    System.out.println(management.sumScoreNumber());
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }

    }
}
