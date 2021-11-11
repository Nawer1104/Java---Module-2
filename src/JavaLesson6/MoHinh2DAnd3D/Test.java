package JavaLesson6.MoHinh2DAnd3D;

public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2.0f, 5.6f);
        System.out.println(point2D);
        float[] arr = point2D.getXY();
        for (float x : arr
             ) {
            System.out.println(x + "\t");
        }

        Point3D point3D = new Point3D(3.5f, 5.6f, 7.9f);
        System.out.println(point3D);
        float[] arr2 = point3D.getXYZ();
        for (float x: arr2
             ) {
            System.out.println(x + "\t");
        }
        point3D.setXYZ(0.1f, 0.2f, 0.3f);
        System.out.println(point3D);
    }
}
