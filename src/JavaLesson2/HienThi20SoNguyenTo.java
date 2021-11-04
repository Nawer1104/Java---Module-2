package JavaLesson2;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
            int num = 3;
            boolean check = true;
        System.out.println("20 first prime numbers is :");
        System.out.println("2");
        for (int i = 2; i <= 20;) {
            for (int j = 2; j < num -1; j++) {
                if (num % j == 0) {
                    check = false;
                    break;
                }
            } if (check) {
                System.out.println(num);
                i++;
            }
            check = true;
            num++;
        }
    }
}