package TestNv;


import java.util.Scanner;

public class Controller {
    static Scanner scanner = new Scanner(System.in);
    static Staff[] listStaff = new Staff[0];

    public static Staff createStaff() {
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        System.out.println("Input address: ");
        String address = scanner.nextLine();
        System.out.println("Input phone number: ");
        String phoneNumber = scanner.nextLine();

        Staff staff = new Staff(name, address, phoneNumber);

        return staff;
    }

    public static void addStaff(Staff staff) {
        Staff[] newStaff = new Staff[listStaff.length + 1];
        for (int i = 0; i < listStaff.length; i++) {
            newStaff[i] = listStaff[i];
        }
        newStaff[listStaff.length] = staff;

        listStaff = newStaff;
    }

    public static Staff[] removeStaff(Staff[] listStaff) {
        System.out.println("Enter staff's id : ");
        int id = scanner.nextInt();
        int index = 0;

        for (int i = 0; i < listStaff.length; i++) {
            if (id == listStaff[i].getId()) {
                index = i;
                break;
            }
        }

        Staff[] newStaff = new Staff[listStaff.length - 1];

        for (int i = index; i < listStaff.length - 1; i++) {
            listStaff[i] = listStaff[i + 1];
        }

        for (int i = 0; i < newStaff.length; i++) {
            newStaff[i] = listStaff[i];
        }

        for (Staff x: newStaff
        ) {
            System.out.println(x.toString());
        }
        return newStaff;
    }

    public static void showAllStaff (Staff[] listStaff) {
        for (Staff x : listStaff
        ) {
            System.out.println(x.toString());
        }
    }

    public static Staff[] fixStaff(Staff[] listStaff) {

        System.out.println("Enter staff's id :");
        int id = scanner.nextInt();

        for (int i = 0; i < listStaff.length; i++) {
            if (id == listStaff[i].getId()) {
                System.out.println("Enter staff's name:");
                String name = scanner.nextLine();
                System.out.println("Enter staff's address:");
                String address = scanner.nextLine();
                System.out.println("Enter staff's phone number:");
                String phoneNumber = scanner.nextLine();

                listStaff[i].setName(name) ;
                listStaff[i].setAddress(address);
                listStaff[i].setPhoneNumber(phoneNumber);
            }
        }
        Staff[] newStaff = new Staff[listStaff.length];

        for (int i = 0; i < newStaff.length; i++) {
            newStaff[i] = listStaff[i];
        }
        for (Staff x : newStaff
        ) {
            System.out.println(x.toString());
        }
        return newStaff;
    }
}