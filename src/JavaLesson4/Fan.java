package JavaLesson4;

public class Fan {
    public static void main(String[] args) {
        int slow = 1;
        int medium = 2;
        int fast = 3;
        fanInformation testFan1 = new fanInformation();

        testFan1.setColor("Blue");
        testFan1.setSpeed(fast);
        testFan1.setOn(true);
        testFan1.setRadius(10);
        System.out.println(testFan1.toString());

        fanInformation testFan2 = new fanInformation();
        testFan1.setColor("Black");
        testFan1.setSpeed(medium);
        testFan1.setOn(false);
        testFan1.setRadius(10);
        System.out.println(testFan1.toString());


    }
}

class fanInformation {
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "white";

    public fanInformation() {

    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean getOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public int setSpeed(int value) {
        return this.speed = value;
    }

    public boolean setOn(boolean status) {
        return this.on = status;
    }

    public double setRadius(double value) {
        return this.radius = value;
    }

    public String setColor(String colorful) {
        return this.color = colorful;
    }

    public String toString() {
        if (this.getOn() == true) {
            return "Fan is now: " + this.on + ", Speed is: " + this.speed + " ,Radius is: " + this.radius + " ,Color is :" + this.color;
        } else {
            return "Fan is now off" + " ,Radius is: " + this.radius + " ,Color is :" + this.color;
        }
    }
}

