package All;

import java.io.*;
import java.util.Scanner;

public class Solution3 {
    public void writeOrder() throws IOException {
        Scanner scanner = new Scanner(new FileInputStream("Root/src/numbers.txt"));
        int position = 1;
        String result = null;
        while (scanner.hasNextLine()) {
            String number = scanner.nextLine();
            if (Integer.parseInt(number) == position) {
                result += number;
                position++;
            }
            if (Integer.parseInt(number) != position) {
                result = "0";
            }
        }
        FileWriter writer = new FileWriter("Root/src/output.txt", false);
        writer.write(result);
        writer.close();

    }
}
