import java.sql.*;
public class DatabaseConnection {
    static Connection connection;
    static Statement statement;
    static PreparedStatement preparedStatement;

    public static void getConnectionWithDatabase() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded ");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice_crud", "root", "1311");
        } catch (ClassNotFoundException e) {
            e.getMessage();
        } catch (SQLException e) {
            e.getMessage();
        }

        System.out.println("Database connection Successfully done");
    }

    public static void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
