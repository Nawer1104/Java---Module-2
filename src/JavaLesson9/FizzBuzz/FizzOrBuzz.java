package JavaLesson9.FizzBuzz;

import java.util.Arrays;

public class FizzOrBuzz {
    int num;
    String result = "";

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
                        result = "";
                        newString[i] = show(newString[i]);
                    }
                }
                for (int i = 0; i < newString.length; i++) {
                    result += newString[i];
                }
            }
        } else {
            result = "Wrong input!";
        }
        return result;
    }

    public String show(String character) {
        switch (character) {
            case "0":
                character = "zero ";
                break;
            case "1":
                character = "one ";
                break;
            case "2":
                character = "two ";
                break;
            case "3":
                character = "three ";
                break;
            case "4":
                character = "four ";
                break;
            case "5":
                character = "five ";
                break;
            case "6":
                character = "six ";
                break;
            case "7":
                character = "seven ";
                break;
            case "8":
                character = "eight ";
                break;
            case "9":
                character = "nine ";
                break;
        }
        return character;
    }
}