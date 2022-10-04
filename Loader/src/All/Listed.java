package All;

import java.util.stream.Stream;

public class Listed {
    public static void main(String[] args) {
      int stream = Stream.of("1", "2","3","4","5")
                .map(Integer::parseInt)
                .reduce(1,(integer, integer2) -> integer * integer2 );
        System.out.println(stream);
    }
    }
