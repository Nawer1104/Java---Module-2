package Test.smallTest;

import java.util.Scanner;

public class cau5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a: ");
        double a = scanner.nextInt();
        System.out.println("Enter number b: ");
        double b = scanner.nextInt();
        System.out.println("Enter number c: ");
        double c = scanner.nextInt();

        System.out.println("Delta is: ");
        double delta = Math.pow(b,2) - 4*a*c ;
        System.out.println(delta);

        if (delta < 0) {
            System.out.println("No result");
        } else if (delta == 0) {
            System.out.println("Double result " + (-b/2*a));
        } else if (delta > 0) {
            System.out.println("X1 gonna be: " + ((-b + Math.sqrt(delta))/ (2*a)));
            System.out.println("X2 gonna be: " + ((-b - Math.sqrt(delta))/ (2*a)));
        }
    }
}
