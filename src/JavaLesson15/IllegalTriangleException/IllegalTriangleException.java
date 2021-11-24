package JavaLesson15.IllegalTriangleException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        IllegalTriangleException illegalTriangleException = new IllegalTriangleException();
        illegalTriangleException.TriangleException();

    }

    public void TriangleException() {
        System.out.println("Enter angle a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter angle b: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter angle c: ");
        int c = Integer.parseInt(scanner.nextLine());
        try {
            if (a + b <= c || a + c <= b || b + c <= a ||
                    a < 0 || b < 0 || c < 0
            )
                throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.out.println("Xảy ra ngoại lệ: Bạn đã nhập sai dữ liệu");
        }
    }
}
