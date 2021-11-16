package JavaLesson9.FizzBuzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzOrBuzzTest {

    @Test
    @DisplayName("Test case 3")
    void fizzOrBuzz1() {
        int num = 3;
        String result;
        String expected = "fizz";

        FizzOrBuzz fizzOrBuzz = new FizzOrBuzz(num);
        result = fizzOrBuzz.fizzOrBuzz(num);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test case 5")
    void fizzOrBuzz2() {
        int num = 5;
        String result;
        String expected = "buzz";

        FizzOrBuzz fizzOrBuzz = new FizzOrBuzz(num);
        result = fizzOrBuzz.fizzOrBuzz(num);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test case 15")
    void fizzOrBuzz3() {
        int num = 15;
        String result;
        String expected = "fizzbuzz";

        FizzOrBuzz fizzOrBuzz = new FizzOrBuzz(num);
        result = fizzOrBuzz.fizzOrBuzz(num);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test case 13")
    void fizzOrBuzz4() {
        int num = 13;
        String result;
        String expected = "fizz";

        FizzOrBuzz fizzOrBuzz = new FizzOrBuzz(num);
        result = fizzOrBuzz.fizzOrBuzz(num);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test case 58")
    void fizzOrBuzz5() {
        int num = 58;
        String result;
        String expected = "buzz";

        FizzOrBuzz fizzOrBuzz = new FizzOrBuzz(num);
        result = fizzOrBuzz.fizzOrBuzz(num);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test case 26")
    void fizzOrBuzz6() {
        int num = 26;
        String result;
        String expected = "two six ";

        FizzOrBuzz fizzOrBuzz = new FizzOrBuzz(num);
        result = fizzOrBuzz.fizzOrBuzz(num);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test case 86")
    void fizzOrBuzz7() {
        int num = 86;
        String result;
        String expected = "eight six ";

        FizzOrBuzz fizzOrBuzz = new FizzOrBuzz(num);
        result = fizzOrBuzz.fizzOrBuzz(num);

        assertEquals(expected, result);
    }
}