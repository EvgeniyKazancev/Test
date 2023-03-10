package Massiv;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        int min = 0;
        int max = 10;
        int step = 2;

        int arrSize = (max - min) / step + 1;
        int currentNumber = min;
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = currentNumber;
            currentNumber += step;
        }

        System.out.println(Arrays.toString(arr));
    }
}
