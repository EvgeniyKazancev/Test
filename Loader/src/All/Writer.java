package All;

/**
import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Writer {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/cifri.txt");
        List <String> read = Files.readAllLines(path);
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("/cifri1.txt")) ) {
            for(int index = read.size() - 1; index >= 0; index--) {
                writer.write(read.get(index));
                writer.write("\n");
            }
        }catch (IIOException e ){
            e.printStackTrace();
        }
    }
}
 */