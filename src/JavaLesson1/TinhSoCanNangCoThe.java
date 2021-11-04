package JavaLesson1;

import java.util.Scanner;

public class TinhSoCanNangCoThe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;

        System.out.println("Your weight in kilogram : ");
        weight = scanner.nextDouble();

        System.out.println("Your height in m : ");
        height = scanner.nextDouble();

        bmi = weight / (height * 2);
        System.out.println("Your bmi is: " + bmi);

        if (bmi < 18)
            System.out.println("Underweight");
        else if (bmi < 25.0)
            System.out.println("Normal");
        else if (bmi < 30.0)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
