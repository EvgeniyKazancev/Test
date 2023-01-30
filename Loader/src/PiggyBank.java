
import java.util.stream.IntStream;

public class PiggyBank {
    public static void main(String[] args) {
      int [] array = new int[100];
      for (int i =0; i< array.length; i++){
          array[i] = (i + 1 )* 10;
          int sum = IntStream.of(array).sum();
          System.out.println(sum);
      }
    }
}
