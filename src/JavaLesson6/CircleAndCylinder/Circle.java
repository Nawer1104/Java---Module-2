package JavaLesson6.CircleAndCylinder;

public class Circle {
    private double radius = 1.0;
    private String color = "white";
    private boolean filled = true;

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + ", radius is:"
                + getRadius()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
}
