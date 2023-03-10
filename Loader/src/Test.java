import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<Integer,Integer> prp = new HashMap<>();
        prp.put(1,2);
        prp.put(3,4);
        prp.forEach((k,v) -> prp.put(v,k));
     }
}