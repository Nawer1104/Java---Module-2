package JavaLesson17.Test;

import java.io.IOException;
import java.io.InputStream;

public class ReadByteConsole {
    public static void main(String[] args) throws IOException {
        InputStream  is = System.in;
        while (true) {
            System.out.println("Enter anything: ");
            int ch = is.read();
            if (ch == 'q') {
                System.out.println("Finished");
                break;
            }
            System.out.println("Entered char is :" + (char) ch);
        }
    }
}
