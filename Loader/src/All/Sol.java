package All;

import java.io.*;
import java.util.Scanner;


public class Sol {

    public String getReceipt() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("src/receipt.txt"));
        double i = 0;
        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().split(";");
            i +=  Double.parseDouble(line[1]) * Double.parseDouble(line[2]);
        }
         return String.format("%2f",i);
        }

    }
