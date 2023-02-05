
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Calculator {
    public static void main(String[] args)  {


    }

 public static Map<String, Integer> romanNumeralMap;

 public  Calculator() {
        romanNumeralMap = new HashMap<String, Integer>();
        romanNumeralMap.put("I", 1);
        romanNumeralMap.put("II", 2);
        romanNumeralMap.put("III", 3);
        romanNumeralMap.put("IV", 4);
        romanNumeralMap.put("V", 5);
        romanNumeralMap.put("VI", 6);
        romanNumeralMap.put("VII", 7);
        romanNumeralMap.put("VIII", 8);
        romanNumeralMap.put("IX", 9);
        romanNumeralMap.put("X", 10);
    }

    public static String Calc(String input) {

        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input string is empty or null");
        }
        String[] cheks = input.split(" ");
        if (cheks.length != 3) {
            throw new IllegalArgumentException("Input string is invalid");
        }

        int res = 0;
        if (Character.isDigit(input.charAt(0)) && Character.isDigit(input.charAt(2))) {
            int firstNum = Integer.parseInt(cheks[0]);
            int secondNum = Integer.parseInt(cheks[2]);
            if (firstNum < 1 || firstNum > 10 || secondNum < 1 || secondNum > 10) {
                throw new IllegalArgumentException("Input numbers must be between 1 and 10");
            }
            switch (cheks[1]) {
                case "+":
                    res = firstNum + secondNum;
                    break;
                case "-":
                    res = firstNum - secondNum;
                    break;
                case "*":
                    res = firstNum * secondNum;
                    break;
                case "/":
                    if (secondNum == 0) {
                        throw new ArithmeticException("Division by zero not allowed");
                    }
                    res = firstNum / secondNum;
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported operation symbol");
            }
        } else if (romanNumeralMap.containsKey(cheks[0].toLowerCase()) &&
                romanNumeralMap.containsKey(cheks[2].toLowerCase())) {
            int firstNum = romanNumeralMap.get(cheks[0].toLowerCase());
            int secondNum = romanNumeralMap.get(cheks[2].toLowerCase());
            if (firstNum < 1 || firstNum > 10 || secondNum < 1 || secondNum > 10) {
                throw new IllegalArgumentException("Input numbers must be between 1 and 10");
            }
            switch (cheks[1]) {
                case "+":
                    res = firstNum + secondNum;
                    break;
                case "-":
                    if (firstNum - secondNum < 1) {
                        throw new IllegalArgumentException("Result of the operation can't be represented using Roman numerals");
                    }
                    res = firstNum - secondNum;
                    break;
                case "*":
                    res = firstNum * secondNum;
                    break;
                case "/":
                    if (secondNum == 0) {
                        throw new ArithmeticException("Division by zero not allowed");
                    }
                    if (firstNum / secondNum < 1) {
                        throw new IllegalArgumentException("Result of the operation can't be represented using Roman numerals");
                    }
                    res = firstNum / secondNum;
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported operation symbol");
            }
        } else {
            throw new IllegalArgumentException("Input string contains mixed representation of numbers");
        }
       return  "" + res;

    }

}
