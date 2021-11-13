package JavaLesson6.CacHeDoiTuongHinhHoc;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square("white", true, 5.0);
        System.out.println(square);

        System.out.println("Area is: " + square.getArea() + " Perimeter is: " + square.getPerimeter());
        square.resize(50);
        System.out.println("New Area is: " + square.getArea() + " New Perimeter is: " + square.getPerimeter());
    }
}
