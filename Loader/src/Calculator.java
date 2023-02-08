

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Calculator {
    public static Map<String, Integer> romanNumeralMap;


    public static void main(String[] args) throws Exception {
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
        System.out.println("Enter the expression :");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(calc(input));
    }

    public static String calc(String input) throws Exception {

        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input string is empty or null");
        }
        String[] cheks = input.split(" ");
        if (cheks.length != 3) {
            throw new IllegalArgumentException("Input string is invalid");
        }

        int res = 0;
        Pattern pattern = Pattern.compile("^-?[0-9]+$");
        Matcher matcher1 = pattern.matcher(cheks[0]);
        Matcher matcher2 = pattern.matcher(cheks[2]);
        if (matcher1.find() && matcher2.find()) {
            int firstNum = Integer.parseInt(cheks[0]);
            int secondNum = Integer.parseInt(cheks[2]);
            res = calculate(cheks, firstNum, secondNum);
            return "" + res;
        } else if (romanNumeralMap.containsKey(cheks[0].toUpperCase()) &&
                romanNumeralMap.containsKey(cheks[2].toUpperCase())) {
            int firstNum = romanNumeralMap.get(cheks[0].toUpperCase());
            int secondNum = romanNumeralMap.get(cheks[2].toUpperCase());
            if (firstNum < 1 || firstNum > 10 || secondNum < 1 || secondNum > 10) {
                throw new IllegalArgumentException();
            }
            res = calculate(cheks, firstNum, secondNum);
            if (res >= 1 && res <= 10) {
                for (Map.Entry<String, Integer> entry : romanNumeralMap.entrySet()) {
                    if (entry.getValue() == res) {
                        return entry.getKey();
                    }
                }
            }
            throw new Exception();
        } else
            throw new IllegalArgumentException();

    }

    private static int calculate(String[] cheks, int firstNum, int secondNum) {
        int res;
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
                throw new IllegalArgumentException();
        }
        return res;
    }

}
