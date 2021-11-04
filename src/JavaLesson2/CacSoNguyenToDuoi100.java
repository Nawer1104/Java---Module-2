package JavaLesson2;

public class CacSoNguyenToDuoi100 {
    public static void main(String[] args) {
        System.out.println("Prime numbers below 100 is: ");
        for (int i = 0; i < 100; i++) {
            if (i < 2) {
                continue;
            } else {
                boolean check = true;
                for (int j = 2; j < i - 1; j++) {
                    if (i % j == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    System.out.println(i);
                }
            }
        }
    }
}

