package JavaLesson1;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Money in USD :");
        int moneyUsd = scanner.nextInt();


        int moneyVnd = moneyUsd * 23000;

        System.out.println("Damn You have :" + moneyVnd + " Vnd");
    }
}
