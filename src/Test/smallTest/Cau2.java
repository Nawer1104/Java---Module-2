package Test.smallTest;

public class Cau2 {
    public static void main(String[] args) {
        System.out.println("Sum of prime numbers from 10 to 50 is :");
        int sum = 0;
        for (int i = 10; i <= 50 ; i++) {
            boolean check = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
