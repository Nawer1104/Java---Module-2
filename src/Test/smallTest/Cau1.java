package Test.smallTest;

public class Cau1 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 11; count <= 20; i++) {
            boolean check = false;
            if (i % 5 == 0) {
                check = true;
                count++;
            }
            if (count == 20 & check == true) {
                System.out.println(i);
            }
        }
    }
}
