import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainBD {
    private static final String URL = "jdbc:postgresql://localhost/postgres?user=postgres&password=0000000";

    private static String conok="1Соединение с бд установлено";
    private static String conerr="2Произошла ошибка подключения к бд";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL)){
            System.out.println(String.format("%s",conok));
        } catch (SQLException e) {
            System.out.println(String.format("%s",conerr));
            e.printStackTrace();
        }
    }
}
