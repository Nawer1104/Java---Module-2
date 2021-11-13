package JavaLesson6.CacHeDoiTuongHinhHoc;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        System.out.println("Area is: " + rectangle.getArea() + " Perimeter is: " + rectangle.getPerimeter());
        rectangle.resize(50);
        System.out.println("New Area is: " + rectangle.getArea() + " New Perimeter is: " + rectangle.getPerimeter());
    }
}
