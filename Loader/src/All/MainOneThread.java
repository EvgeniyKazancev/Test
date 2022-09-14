package All;

import java.util.*;

public class MainOneThread {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        // 1 часть

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10000000; i++) {
            numbers.add(i);
        }
        int max = Collections.max(numbers);

        System.out.println("Max found: " + max);

        // 2 часть

        List<Integer> unsorted = new ArrayList<>();
        for (int i = 10000000; i >= 1; i--) {
            unsorted.add(i);
        }
        Collections.sort(unsorted);
        System.out.println("List is sorted now");

        // 3 часть

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10000000; i++) {
            list.add(i);
        }
        while (list.size() != 0) {
            list.remove(list.size() - 1);
        }
        System.out.println("List cleared");


        // Итог

        long end = System.currentTimeMillis();

        System.out.println("Total time: " + (end - start) + " ms");
    }
}
