package JavaLesson6.CacHeDoiTuongHinhHoc;

public class TestShape {
    public static void main(String[] args) {

        Shape shape = new Shape("red",false);
        System.out.println(shape);

        Circle circle = new Circle("black", true, 4.0);
        System.out.println(circle);

        System.out.println(circle.getArea());

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle("White", true, 4.0, 7.0);
        System.out.println(rectangle);

        Square square = new Square("Blue", true, 2.5);
        System.out.println(square);
    }
}
