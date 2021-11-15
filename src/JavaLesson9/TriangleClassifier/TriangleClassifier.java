package JavaLesson9.TriangleClassifier;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side a:");
        double sideA = scanner.nextDouble();
        System.out.println("Enter side b:");
        double sideB = scanner.nextDouble();
        System.out.println("Enter side c:");
        double sideC = scanner.nextDouble();
        String result;
        Triangle triangle = new Triangle(sideA, sideB, sideC);

        result = triangle.triangleClassifier(sideA, sideB, sideC);
        System.out.println(result);
    }
}
