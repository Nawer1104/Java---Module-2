package JavaLesson3;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] arr;
        do {
            System.out.println("Enter size of the array:");
            size = scanner.nextInt();
        } while (size < 0);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Enter element of " + (i + 1) + " :");
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Your array now is :");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        System.out.println("Enter number you want to add-on: ");
        int num = scanner.nextInt();

        System.out.println("Enter position you want to add-on: ");
        int index = scanner.nextInt();

        while (index < 1 || index > arr.length) {
            System.out.println("Can't do it!");
            System.out.println("Enter position you want to add-on: ");
            index = scanner.nextInt();
        }

        for (int j = 0; j < arr.length; j++) {
            if (j == index) {
                for (int k = arr.length - 1; k >= j ; k--) {
                    arr[k] = arr[k - 1];
                }
                arr[j] = num;
            }
        }
        System.out.println();
        System.out.println("Your array now is: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
    }
}
