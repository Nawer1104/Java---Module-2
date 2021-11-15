package JavaLesson9.TriangleClassifier;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {


    @Test
    @DisplayName("Testing 2 - 2 - 2")
    void triangleClassifier1() {
        double sideA = 2;
        double sideB = 2;
        double sideC = 2;
        String expected = "equilateral triangle!";

        String result;
        Triangle triangle = new Triangle(sideA, sideB, sideC);
        result = triangle.triangleClassifier(sideA, sideB, sideC);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing 2 - 2 - 3")
    void triangleClassifier2() {
        double sideA = 2;
        double sideB = 2;
        double sideC = 3;
        String expected = "isosceles triangle!";

        String result;
        Triangle triangle = new Triangle(sideA, sideB, sideC);
        result = triangle.triangleClassifier(sideA, sideB, sideC);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing 3 - 4 - 5")
    void triangleClassifier3() {
        double sideA = 3;
        double sideB = 4;
        double sideC = 5;
        String expected = "normal triangle!";

        String result;
        Triangle triangle = new Triangle(sideA, sideB, sideC);
        result = triangle.triangleClassifier(sideA, sideB, sideC);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing 8 - 2 - 3")
    void triangleClassifier4() {
        double sideA = 8;
        double sideB = 2;
        double sideC = 3;
        String expected = "Not a triangle!";

        String result;
        Triangle triangle = new Triangle(sideA, sideB, sideC);
        result = triangle.triangleClassifier(sideA, sideB, sideC);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing -1 - 2 - 1")
    void triangleClassifier5() {
        double sideA = -1;
        double sideB = 2;
        double sideC = 1;
        String expected = "Not a triangle!";

        String result;
        Triangle triangle = new Triangle(sideA, sideB, sideC);
        result = triangle.triangleClassifier(sideA, sideB, sideC);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing 0 - 1 - 1")
    void triangleClassifier6() {
        double sideA = 0;
        double sideB = 1;
        double sideC = 1;
        String expected = "Not a triangle!";

        String result;
        Triangle triangle = new Triangle(sideA, sideB, sideC);
        result = triangle.triangleClassifier(sideA, sideB, sideC);

        assertEquals(expected, result);
    }
}