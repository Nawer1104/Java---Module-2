package JavaLesson3;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Enter size of the array:");
            size = scanner.nextInt();
        } while (size < 0);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element of " + (i + 1) + " :");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Your array now is :");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (max < array[j]) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest number in the array is: " + max + " at position " + index );
    }
}
