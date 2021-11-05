package Test.smallTest;

import java.util.Scanner;

public class cau4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play a game. Enter a number :");
        int num = scanner.nextInt();

        long randomNumber = Math.round(Math.random() * 9) + 1;

        while (num < 1 || num > 10) {
            System.out.println("Your input number must be from 1 to 10!");
            System.out.println("Try again: ");
            num = scanner.nextInt();
        }
        if (num != randomNumber) {
            while (num != randomNumber) {
                if (num < randomNumber) {
                    System.out.println("A little bit");
                } else if (num > randomNumber) {
                    System.out.println("A little too much");
                }
                num = scanner.nextInt();
            }
        } else {
            System.out.println("Yeah you got it!!");
        }
    }
}
