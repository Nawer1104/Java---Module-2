package TestNv;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NhanVien[] nhanVien = new NhanVien[3];
        nhanVien[0] = new NhanVien("Nam", 2555, "Ha Noi");
        nhanVien[1] = new NhanVien("Minh", 3000, "Ha Noi");
        nhanVien[2] = new NhanVien("Duong", 2666, "Hai Phong");

        int choice = -1;
        while (choice != 0) {
            System.out.println("1: Hien thi nhan vien");
            System.out.println("2: Them nhan vien");
            System.out.println("3: Xoa nhan vien");
            System.out.println("4: Sua nhan vien");
            System.out.println("0: Exit");

            int so = scanner.nextInt();

            switch (so) {
                case 1:
                    show(nhanVien);
                    break;
                case 2:
                    nhanVien = create(nhanVien);
                    break;
                case 3:
                    nhanVien = delete(nhanVien);
                    break;
                case 4:
                    nhanVien = fix(nhanVien);
                    break;
                case 0:
                    System.exit(0);
            }
        }

    }

    public static void show(NhanVien[] nhanVien) {
        for (NhanVien x : nhanVien
        ) {
            System.out.println(x.toString());
        }
    }

    public static NhanVien[] create(NhanVien[] nhanVien) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Adress:");
        String address = scanner.nextLine();
        System.out.println("Phone Number:");
        int phoneNumber = scanner.nextInt();

        NhanVien nhanVienn = new NhanVien(name, phoneNumber, address);

        NhanVien[] newNV = new NhanVien[nhanVien.length + 1];
        for (int i = 0; i < nhanVien.length; i++) {
            newNV[i] = nhanVien[i];
        }

        newNV[nhanVien.length] = nhanVienn;

        for (NhanVien x : newNV
        ) {
            System.out.println(x.toString());
        }
        return newNV;
    }

    public static NhanVien[] delete(NhanVien[] nhanVien) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Dien id thang can xoa:");
        int id = scanner.nextInt();
        int index = 0;

        for (int i = 0; i < nhanVien.length; i++) {
            if (id == nhanVien[i].getId()) {
                index = i;
                break;
            }
        }

        NhanVien[] newNV = new NhanVien[nhanVien.length - 1];

        for (int i = index; i < nhanVien.length - 1; i++) {
            nhanVien[i] = nhanVien[i +1];
        }

        for (int i = 0; i < newNV.length; i++) {
            newNV[i] = nhanVien[i];
        }
        for (NhanVien x : newNV
        ) {
            System.out.println(x.toString());
        }
        return newNV;
    }

    public static NhanVien[] fix(NhanVien[] nhanVien) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Dien id thang can sua:");
        int id = scanner.nextInt();


        for (int i = 0; i < nhanVien.length; i++) {
            if (id == nhanVien[i].getId()) {
                System.out.println("Name:");
                scanner.nextLine();
                String name = scanner.nextLine();
                System.out.println("Address:");
                String address = scanner.nextLine();
                System.out.println("Phone Number:");
                int phoneNumber = scanner.nextInt();

                nhanVien[i].setName(name) ;
                nhanVien[i].setPhoneNumber(phoneNumber);
                nhanVien[i].setAddress(address);
            }
        }
        NhanVien[] newNV = new NhanVien[nhanVien.length];

        for (int i = 0; i < newNV.length; i++) {
            newNV[i] = nhanVien[i];
        }
        for (NhanVien x : newNV
        ) {
            System.out.println(x.toString());
        }
        return newNV;
    }
}
