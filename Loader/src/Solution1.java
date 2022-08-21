import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Solution1 {
    public int getCountWords() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream(" text.txt"));
        int numberWords = 0;
        while (scanner.hasNextLine()){
            String[] line = scanner.nextLine().split(" ");
            numberWords += line.length;
        }
        return numberWords;
    }
}
