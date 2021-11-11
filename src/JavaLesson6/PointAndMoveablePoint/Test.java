package JavaLesson6.PointAndMoveablePoint;

public class Test {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(0.0f, 0.0f, 1, 2);
        System.out.println(movablePoint);
        float[] arr = movablePoint.move();
        for (float x: arr
             ) {
            System.out.println(x);
        }

        System.out.println(movablePoint);
        for (int i = 0; i < 4; i++) {
            movablePoint.move();
        }

        System.out.println(movablePoint);
    }
}
