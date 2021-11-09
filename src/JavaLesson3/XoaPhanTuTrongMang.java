package JavaLesson3;

import java.util.Scanner;

public class XoaPhanTuTrongMang {
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

        System.out.println("Enter number you want to delete: ");
        int num = scanner.nextInt();
        int index = 0;
        for (int j = 0; j < arr.length; j++) {
            if (num == arr[j]) {
                 index = j;
            }
        }

        for (int j = index; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
        }

        System.out.println("Result : ");

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ,");
        }



    }
}
