package JavaLesson6.BaiTapNangCao;

import java.util.Scanner;

public class Kiemhu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side 1 of the triangle :");
        double side1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter side 2 of the triangle :");
        double side2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter side 3 of the triangle :");
        double side3 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter color of the triangle :");
        String color = scanner.nextLine();

        Triangle triangle = new Triangle(color, true, side1, side2, side3);
        System.out.println(triangle);
    }
}
