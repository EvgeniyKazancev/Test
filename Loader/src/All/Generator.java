package All;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Generator {
    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1, 100);
        int str = stream
                .skip(50)
                .filter(i -> i % 2 == 0 || i % 5 == 0)
                .sum();
        System.out.println(str);

    }
}