
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.time.LocalDate;

import java.util.List;



public class Wastes {


    public static void main(String[] args) {
        final Path file1 = Paths.get("src/balance.txt");
        LocalDate date = LocalDate.now();
        final Path fileWrite = Paths.get("balance_total" + date + ".txt");
        try {
            List<String> myFile = Files.readAllLines(file1, Charset.defaultCharset());
            List<String[]> myFileStream = myFile.stream()
                    .map(a -> {
                        String[] splitLine = a.split(",");
                        return new String[]{splitLine[0], splitLine.length > 1 ? splitLine[1].trim() : "0"};
                    })
                    .sorted((o1, o2) -> Integer.parseInt(o2[1]) - Integer.parseInt(o1[1])).toList();
            try (BufferedWriter bufferedWriter = Files.newBufferedWriter(fileWrite, Charset.defaultCharset())) {
                int total = 0;
                for(int i = 0;i < myFileStream.size(); i++) {
                   bufferedWriter.write(myFileStream.get(i)[0] + ", " + myFileStream.get(i)[1] + "\n");
                   total += Integer.parseInt(myFileStream.get(i)[1]);
                }

                bufferedWriter.write("Itogo: " + total + " rub. " + date );
            } catch (IOException e) {
                e.printStackTrace();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}