package JavaLesson1;


import java.util.Random;

public class test2 {
    public static void main(String[] args) {
        Random random = new Random();
        double min = 1.0;
        double max = 100.0;
        double x =  Math.round((Math.random() * ((max - min) + 1)) + min);
        System.out.println(x);
    }
}

