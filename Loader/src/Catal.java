import java.io.File;

public class Catal {
    public static void main(String[] args) {
        File Catalog = new File( "C:\\StarsCaption ");
        long length = Catalog.length();
        System.out.println(length / 1000);
    }
}
