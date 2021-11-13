package JavaLesson6.CacHeDoiTuongHinhHoc;

import JavaLesson7.InterfaceColorable.Colorable;
import JavaLesson7.InterfaceResizeable.Resizeable;

public class Circle extends Shape implements Resizeable, Colorable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", have Area is: "
                + getArea()
                + ", have Perimeter is: "
                + getPerimeter()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.radius = (this.radius * percent / 100) + this.radius;
    }

    @Override
    public String howToColor() {
        return "Color all four sides";
    }
}