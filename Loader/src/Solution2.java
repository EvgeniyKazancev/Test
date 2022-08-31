import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {

    }
    public int getMul() throws IOException {
        Scanner scanner = new Scanner(new FileInputStream("Root/src/data.txt"));
        int compos = 1;
        int oneLineMax = scanner.nextInt();

        String[] line = scanner.nextLine().split(" ");
        int[] delLines = new int[line.length];

        for (int i = 0; i < line.length; i++) {
            delLines[i] = Integer.parseInt(line[i]);
        }

        for (int i = 0; i <= oneLineMax; i++) {
            for (int delLine : delLines) {
                if (i % delLine == 0) {
                    compos *= i;
                }
            }
        }
        return compos;
    }


}