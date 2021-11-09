package JavaLesson5;

public class Circle {
    private double radius = 1;
    private String color = "Red";

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    protected double getRadius() {
        return this.radius;
    }

    protected double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}

class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5);

        double area = circle.getArea();
        double radius = circle.getRadius();
        System.out.println("Area of circle is " + area + "\n" + "Circle's radius is: " + radius );
    }
}
