package JavaLesson3;

import java.util.Scanner;

public class TinhTongCacSoTrong1Cot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row;
        do {
            System.out.println("Enter rows in matrix :");
            row = scanner.nextInt();
        } while (row < 0);

        int col;
        do {
            System.out.println("Enter cols of the matrix :");
            col = scanner.nextInt();
        } while (col < 0);

        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter element of " + i + " ," + j);
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println();
        System.out.println("Your array now is :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + " ");
            }
        }

        System.out.println("Sum of which row do you want to know?");
        int num = scanner.nextInt();
        int sum = 0;
        if (0 <= num && num <= row) {
                for (int j = 0; j < arr[num].length; j++) {
                    sum += arr[num][j];
                }

        } else {
            System.out.println("Wrong input!");
            num = scanner.nextInt();
        }
        System.out.println();
        System.out.println("Sum of row " + num  + " in the array is :" + sum);
    }
}
