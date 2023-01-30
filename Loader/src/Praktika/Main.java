package Praktika;

import java.util.Optional;
import java.util.Random;

public class Main {

    private static Optional<String> Guess(int guess) {
        if (guess < 1 || 5 < guess) {
            throw new IllegalStateException();
        } else {
            int bound = new Random().nextInt(5) + 1;
            System.out.println(bound);
            if (bound == guess) {
                return Optional.of("Congratulate!You guessed the value!");
            } else
                return Optional.empty();
        }

    }

}



