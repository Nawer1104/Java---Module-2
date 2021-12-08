package JavaLesson16.Test;

import java.io.IOException;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) throws IOException {
        while(true) {
            System.out.println("Enter a String:");
            byte[] bytes = new byte[100];
            int length = System.in.read(bytes);
            String str = new String(bytes, 0, length - 2);

            if (str.equalsIgnoreCase("EXIT")) {
                System.out.println("Finished!");
                break;
            }
            System.out.println("Input String " + str);
        }
    }
}
