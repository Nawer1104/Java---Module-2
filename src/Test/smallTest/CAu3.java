package Test.smallTest;

import java.util.Scanner;

public class CAu3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = scanner.nextInt();

        if (num < 2) {
            System.out.println("Is not a prime");
        } else {
            boolean check = true;
            for (int i = 2; i < num - 1; i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("Is prime");
            } else {
                System.out.println("Is not a prime");
            }
        }
    }
}
