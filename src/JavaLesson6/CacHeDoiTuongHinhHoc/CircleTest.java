package JavaLesson6.CacHeDoiTuongHinhHoc;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        System.out.println("Area is: " + circle.getArea() + "Perimeter is: " + circle.getPerimeter());

        circle.resize(50);
        System.out.println("New Area is: " + circle.getArea() + "New Perimeter is: " + circle.getPerimeter());
    }
}
