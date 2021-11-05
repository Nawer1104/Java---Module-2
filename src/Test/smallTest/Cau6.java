package Test.smallTest;

import java.util.Scanner;

public class Cau6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Chào bạn đến với GAME AI LÀ TRIỆU PHÚ.");
            System.out.println("LỚP C0921K1 CÓ BAO NHIÊU BẠN NỮ ?");
            System.out.println("1. 1 Bạn ");
            System.out.println("2. 2 Bạn");
            System.out.println("3. 3 Bạn");
            System.out.println("4. 4 Bạn");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Sai Mất Rồi!!");
                    break;
                case 2:
                    System.out.println("Sai Mất Rồi!!");
                    break;
                case 3:
                    System.out.println("Đúng Rồi!!");
                    break;
                case 4:
                    System.out.println("Sai Mất Rồi!!");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Sao Không Chọn Gì À??");
            }
        }
    }
}
