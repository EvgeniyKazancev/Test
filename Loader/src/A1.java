/**import java.util.Arrays;
public class A1 {
    public static int[] numbers = new int[100];

    public static void main(String[] args) {
        // code here...
       numbers[0] = 1;
        for(i = 0, stop = numbers.length; i < stop; i++){
            numbers[i]= (int) (Math.pow(-1, i) * (numbers[i] + i));


        }
        System.out.println(Arrays.toString(numbers));
    }
}
**/