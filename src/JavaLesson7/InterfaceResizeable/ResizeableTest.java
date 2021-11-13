package JavaLesson7.InterfaceResizeable;

import JavaLesson6.CacHeDoiTuongHinhHoc.Circle;
import JavaLesson6.CacHeDoiTuongHinhHoc.Rectangle;
import JavaLesson6.CacHeDoiTuongHinhHoc.Square;

import java.util.Random;
import java.util.Scanner;

public class ResizeableTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome");
            System.out.println("Enter 1 to create a random Circle");
            System.out.println("Enter 2 to create a random Rectangle");
            System.out.println("Enter 3 to create a random Square");
            System.out.println("Enter 0 to quit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createCircle();
                    break;
                case 2:
                    createRectangle();
                    break;
                case 3:
                    createSquare();
                    break;
                case 0:
                    System.exit(0);

            }
        }
    }
    public static void createCircle() {
        Random random = new Random();
        boolean randomFilled = random.nextBoolean();
        double randomPercent =  Math.round((Math.random() * ((100 - 1) + 1)) + 1);


        Circle circle = new Circle("white", randomFilled, 5);
        System.out.println(circle);
        circle.resize(randomPercent);
        System.out.println("After random resized with " + randomPercent + " percent we have: ");
        System.out.println(circle);
    }
    public static void createRectangle() {
        Random random = new Random();
        boolean randomFilled = random.nextBoolean();
        double randomPercent =  Math.round((Math.random() * ((100 - 1) + 1)) + 1);


        Rectangle rectangle = new Rectangle("white", randomFilled, 5, 8);
        System.out.println(rectangle);
        rectangle.resize(randomPercent);
        System.out.println("After random resized with " + randomPercent + " percent we have: ");
        System.out.println(rectangle);
    }
    public static void createSquare() {
        Random random = new Random();
        boolean randomFilled = random.nextBoolean();
        double randomPercent =  Math.round((Math.random() * ((100 - 1) + 1)) + 1);


        Square square = new Square("white", randomFilled, 5);
        System.out.println(square);
        square.resize(randomPercent);
        System.out.println("After random resized with " + randomPercent + " percent we have: ");
        System.out.println(square);
    }
}
