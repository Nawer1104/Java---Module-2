package JavaLesson6.PointAndMoveablePoint;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed () {
        float[] arr = new float[2];
        arr[0] = this.xSpeed;
        arr[1] = this.ySpeed;
        return arr;
    }

    public float[] move() {
       float x = super.getX();
       float y = super.getY();

       super.setX(x += this.xSpeed );
       super.setY(y += this.ySpeed );

       float[] arr = new float[2];
       arr[0] = super.getX();
       arr[1] = super.getY();
       return arr;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x point :" + super.getX() +
                ", y point :" + super.getY() +
                "xSpeed=" + getxSpeed() +
                ", ySpeed=" + getySpeed() +
                '}';
    }
}
