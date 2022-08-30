
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Lis {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 99; i++) {
            list.add(i);
        }
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
