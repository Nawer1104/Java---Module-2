package JavaLesson6.CircleAndCylinder;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "black", true);
        System.out.println(circle);
        System.out.println("Circle area is :" + circle.getArea());
        System.out.println("Circle Circumference is :" + circle.getCircumference());

        Cylinder cylinder = new Cylinder(7.0, "pink", false, 15.0);
        System.out.println(cylinder);
    }
}
