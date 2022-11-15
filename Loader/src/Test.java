import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String[] test = {"a", "r", "o", "w", "b", "c", "p"};
        List<String> tester = new ArrayList(List.of(test));

        Collections.sort(tester);
        System.out.println(tester);
    }
}