package JavaLesson3;

import java.util.Scanner;

public class DemSoLuongSinhVienThiDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] arr;
        do {
            System.out.println("Enter a size of the arr:");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Size must be blow 30");
            }
        } while (size > 30);

        System.out.println();
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            do {
                System.out.println("Enter mark of student: ");
                arr[i] = scanner.nextInt();
                if (arr[i] > 10 && arr[i] < 0) {
                    System.out.println("Wrong input!");
                }
            } while (arr[i] > 10 && arr[i] < 0);
        }

        System.out.println();
        int count = 0;
        System.out.println("List of mark :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
            if (arr[i] >= 5 && arr[i] <= 10) {
                count ++;
            }
        }
        System.out.println("Number of students pass the exam is:" + count);
    }
}
