package JavaLesson6.CacHeDoiTuongHinhHoc;

import JavaLesson7.InterfaceResizeable.Resizeable;

public class Square  extends  Rectangle implements Resizeable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    public double getSide() {
        return getWidth();
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", have Area is: "
                + getArea()
                + ", have Perimeter is: "
                + getPerimeter()
                + ", which is a subclass of "
                + super.toString();
    }

}
