package JavaLesson4;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a:");
        double a = scanner.nextDouble();
        System.out.println("Enter number b:");
        double b = scanner.nextDouble();
        System.out.println("Enter number c:");
        double c = scanner.nextDouble();

        QuadraticEquational quadraticEquation = new QuadraticEquational(a, b, c);

        double dental = quadraticEquation.getDiscriminant();

        if (dental < 0) {
            System.out.println("The equation has no roots");
        } else if (dental > 0) {
            System.out.println("The equation has two roots: " + quadraticEquation.getRoot1() + " and" + quadraticEquation.getRoot2());
        } else if (dental == 0) {
            System.out.println("The equation has one roots: " + quadraticEquation.getRoot1());
        }
    }
}

class QuadraticEquational {
    double a;
    double b;
    double c;

    public  QuadraticEquational() {

    }

    QuadraticEquational(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void setA (double newA) {
        a = newA;
    }

    void setB (double newB) {
        b = newB;
    }

    void setC (double newC) {
        c = newC;
    }

    public double getDiscriminant() {
        return this.b * this.b - (4 * this.a * this.c) ;
    }

    public double getRoot1() {
        return ((-this.b + Math.sqrt(getDiscriminant())) / 2*this.a);
    }

    public double getRoot2() {
        return ((-this.b - Math.sqrt(getDiscriminant())) / 2*this.a);
    }
}