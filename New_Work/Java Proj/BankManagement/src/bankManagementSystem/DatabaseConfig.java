package bankManagementSystem;

import java.sql.*;

public class DatabaseConfig {

    Connection connection;
    Statement statement;
    public DatabaseConfig() {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem","root","1311");
            System.out.println("Database connected successfully");

            statement = connection.createStatement();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
