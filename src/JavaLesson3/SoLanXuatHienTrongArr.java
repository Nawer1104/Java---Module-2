package JavaLesson3;

import java.util.Scanner;

public class SoLanXuatHienTrongArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string :");
        String string = scanner.nextLine();

        String[] newString = string.split("");

        System.out.println();
        System.out.println("Enter any character but just 1 :");
        String value = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < newString.length; i++) {
            if (value.equals(newString[i])) {
                count++;
            }
        }
        System.out.println("Your entered character " + value + " happens in the array " + count + " time!" );
    }
}
