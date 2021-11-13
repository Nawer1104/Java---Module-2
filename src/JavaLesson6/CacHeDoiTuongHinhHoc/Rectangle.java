package JavaLesson6.CacHeDoiTuongHinhHoc;

import JavaLesson7.InterfaceResizeable.Resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", have Area is: "
                + getArea()
                + ", have Perimeter is: "
                + getPerimeter()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.width = this.width + (this.width * percent / 100);
        this.length = this.length + (this.length * percent / 100);
    }
}