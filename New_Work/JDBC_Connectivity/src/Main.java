import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/revenue", "root", "1311");
        System.out.println("Connection Established Successfully");

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM revenue.revenue_details");

        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + " " + resultSet.getInt("years") + " " + resultSet.getInt(3));
        }

        connection.close();
    }
}