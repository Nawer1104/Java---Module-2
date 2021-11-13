package JavaLesson7.InterfaceColorable;


import JavaLesson6.CacHeDoiTuongHinhHoc.Circle;
import JavaLesson6.CacHeDoiTuongHinhHoc.Rectangle;
import JavaLesson6.CacHeDoiTuongHinhHoc.Shape;
import JavaLesson6.CacHeDoiTuongHinhHoc.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(5, 10);
        shapes[2] = new Square(5);
        shapes[3] = new Circle(7);

        for (Shape x: shapes
             ) {
            System.out.println(x.getArea());
            if(x instanceof Circle) {
                System.out.println(((Circle) x).howToColor());
            }
        }
    }
}
