package JavaLesson9.TriangleClassifier;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    private String result;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public boolean checkTriangle() {
        boolean checkTriangle = false;
        if ((sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA)) {
            checkTriangle = true;
        }
        return checkTriangle;
    }

    public String triangleClassifier (double sideA, double sideB, double sideC) {
        if (checkTriangle()) {
            if (Math.pow(sideA, 2) == Math.pow(sideB, 2) + Math.pow(sideC, 3) &&
                    Math.pow(sideA, 2) == Math.pow(sideB, 2) + Math.pow(sideC, 3) &&
                    Math.pow(sideA, 2) == Math.pow(sideB, 2) + Math.pow(sideC, 3)
            ) {
                result = "right-angled triangle!";
            }
            else if (sideA == sideB && sideB == sideC) {
                result = "equilateral triangle!";
            } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
                result = "isosceles triangle!";
            } else {
                result = "normal triangle!";
            }
        } else {
            result = "Not a triangle!";
        }
        return result;
    }
}
