

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
            if (firstNum < 1 || firstNum > 10 || secondNum < 1 || secondNum > 10) {
                throw new IllegalArgumentException();
            }
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
            } else if (res > 10) {
                return toRoman(res);
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

    private static int[] intervals = {0, 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    private static String[] numerals = {"", "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

    private final static int findFloor(final int number, final int firstIndex, final int lastIndex) {
        if (firstIndex == lastIndex)
            return firstIndex;
        if (intervals[firstIndex] == number)
            return firstIndex;
        if (intervals[lastIndex] == number)
            return lastIndex;
        final int median = (lastIndex + firstIndex) / 2;
        if (median == firstIndex)
            return firstIndex;
        if (number == intervals[median])
            return median;
        if (number > intervals[median])
            return findFloor(number, median, lastIndex);
        else
            return findFloor(number, firstIndex, median);

    }

    public final static String toRoman(final int number) {
        int floorIndex = findFloor(number, 0, intervals.length - 1);
        if (number == intervals[floorIndex])
            return numerals[floorIndex];
        return numerals[floorIndex] + toRoman(number - intervals[floorIndex]);
    }
}
