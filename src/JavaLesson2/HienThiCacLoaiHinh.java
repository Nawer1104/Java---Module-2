package JavaLesson2;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle top - left");
            System.out.println("3. Print the square triangle top - right");
            System.out.println("4. Print the square triangle bottom - left");
            System.out.println("5. Print the square triangle bottom - right");
            System.out.println("6. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    for (int i = 7; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    for (int i = 0, j = 7; i <= 7 || j >= 0; i++, j--) {
                        System.out.println();
                        for (int h = 0; h < i; h++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k < j; k++) {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 5:
                    for (int i = 7, j = 0; i >= 0 || j <= 7; i--, j++) {
                        System.out.println();
                        for (int h = 0; h < i; h++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k < j; k++) {
                            System.out.print("*"); // <----
                        }
                    }
                    System.out.println();
                    break;
                case 6:
                    for (int i = 7, j = 0; i >= 0 || j <= 7; i--, j++) {
                        System.out.println();
                        for (int h = 0; h < i; h++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k < j; k++) {
                            System.out.print("* "); // vcl !!
                        }
                    }
                    System.out.println();
                    break;
            }
        }
    }
}
