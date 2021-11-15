package JavaLesson9.FizzBuzz;

public class FizzOrBuzz {
    int num;
    String result;

    public FizzOrBuzz(int num) {
        this.num = num;
    }

    public String fizzOrBuzz(int num) {
        if (num > 0) {
            if (num % 3 == 0 && num % 5 != 0) {
                result = "fizz";
            } else if (num % 5 == 0 && num % 3 != 0) {
                result = "buzz";
            } else if (num % 3 == 0 && num % 5 == 0) {
                result = "fizzbuzz";
            } else {
                result = String.valueOf(num);
                String[] newString = result.split("");

                for (int i = 0; i < newString.length; i++) {
                    if (newString[i].equals("3")) {
                        result = "fizz";
                    } else if (newString[i].equals("5")) {
                        result = "buzz";
                    } else {
                        int stringToNumber = Integer.parseInt(newString[i]);
                        show(stringToNumber);
                    }
                }
            }
        } else {
            result = "Wrong input!";
        }
        return result;
    }

    public void show(int num) {
        switch (num) {
            case 0:
                System.out.print("zero ");
                break;
            case 1:
                System.out.print("one ");
                break;
            case 2:
                System.out.print("two ");
                break;
            case 3:
                System.out.print("three ");
                break;
            case 4:
                System.out.print("four ");
                break;
            case 5:
                System.out.print("five ");
                break;
            case 6:
                System.out.print("six ");
                break;
            case 7:
                System.out.print("seven ");
                break;
            case 8:
                System.out.print("eight ");
                break;
            case 9:
                System.out.print("nine ");
                break;
        }
    }
}