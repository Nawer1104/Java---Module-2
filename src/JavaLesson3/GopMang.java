package JavaLesson3;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] arr1;
        int[] arr2;

        do {
            System.out.println("Enter size of the array 1 :");
            size = scanner.nextInt();
        } while (size < 0);
        arr1 = new int[size];
        int i = 0;
        while (i < arr1.length) {
            System.out.println("Enter element of " + (i + 1) + " :");
            arr1[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Your array now is :");
        for (int j = 0; j < arr1.length; j++) {
            System.out.print(arr1[j] + " ");
        }
        System.out.println();

        do {
            System.out.println("Enter size of the array 2 :");
            size = scanner.nextInt();
        } while (size < 0);
        arr2 = new int[size];
        int j = 0;
        while (j < arr2.length) {
            System.out.println("Enter element of " + (j + 1) + " :");
            arr2[j] = scanner.nextInt();
            j++;
        }
        System.out.println("Your array now is :");
        for (int k = 0; k < arr2.length; k++) {
            System.out.print(arr2[k] + " ");
        }
        System.out.println();

        int[] arr3 = new int[arr1.length + arr2.length];

        for (int k = 0; k < arr1.length; k++) {
            arr3[k] = arr1[k];
        }

        for (int k = 0, l = arr3.length - arr1.length - 1; k < arr2.length && l < arr3.length; k++, l++) {
            arr3[l] = arr2[k];
        }

        for (int k = 0; k < arr3.length; k++) {
            System.out.print(arr3[k] + ", ");
        }
    }
}
