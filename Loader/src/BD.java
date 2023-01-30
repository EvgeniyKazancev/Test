import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BD
{
    private final static String HOST = "localhost"; // сервер базы данных
    private final static String DATABASENAME = "Test"; // имя базы
    private final static String USERNAME = "postgres"; // учетная запись пользователя
    private final static String PASSWORD = "Kvadrat24"; // пароль
    public static void main(String[] args)
    {
        String url = "jdbc:postgresql://" + HOST + "/" + DATABASENAME + "?user=" + USERNAME + "&password=" + PASSWORD;
        try (Connection connection = DriverManager.getConnection(url, USERNAME, PASSWORD)) {
            if (connection == null)
                System.err.println("Нет соединения с БД!");
            else {
                System.out.println("Соединение с БД установлено.");
                String SQL = "ALTER TABLE test ADD name varchar(255);"; // Добавление столбца name
                try (PreparedStatement preparedStatement = connection.prepareStatement(SQL))
                {
                    preparedStatement.executeUpdate();
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}