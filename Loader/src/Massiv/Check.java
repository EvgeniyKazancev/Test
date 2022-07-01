package Massiv;
import java.util.Arrays;


public class Check {
    public static void main(String[] args) {
        int[] arr = {27, 97, 86, 88, 31, 46, 59, 48, 16, 4};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");

          Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}