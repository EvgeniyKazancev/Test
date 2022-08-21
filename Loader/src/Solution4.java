import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution4 {
    public boolean arePalindromes() throws IOException {
        Scanner scanner = new Scanner(new FileInputStream("strings.txt"));
        String st;
        st = scanner.nextLine();
        if (st.equals(new StringBuilder(st).reverse().toString())) return true;
            return false;
    }
}
