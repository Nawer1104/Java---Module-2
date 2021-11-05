package JavaLesson3;

import java.util.Scanner;

public class FindMin {
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
        int index = minValue(arr);

        System.out.println("The smallest element in the array is :" + arr[index]);

    }
    public static int minValue(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = i;
            }
        }
        return min;
    }
}
