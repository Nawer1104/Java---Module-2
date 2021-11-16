package TestNv;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Staff management system");
            System.out.println("1.Add more staff");
            System.out.println("2.Remove Staff");
            System.out.println("3.Show all staff");
            System.out.println("4.Edit staff");
            System.out.println("5.Exit System");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    Staff staff = Controller.createStaff();
                    Controller.addStaff(staff);
                    break;
                case 2:
                    Controller.removeStaff(Controller.listStaff);
                    break;
                case 3:
                    Controller.showAllStaff(Controller.listStaff);
                    break;
                case 4:
                    Controller.fixStaff(Controller.listStaff);
                    break;
                case 5:
                    System.exit(5);

            }
        }
    }
}
