import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {

    private int rollNumber;
    private String name;
    private String section;
    private String city;

    public Student() {
    }

    public Student(int rollNumber, String name, String section, String city) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.section = section;
        this.city = city;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    static Statement statement;

    public static void createStudentTable() throws SQLException {

        DatabaseConnection.getConnectionWithDatabase();
//        String createTable = "create table student(roll_number int(5), name varchar, section varchar, city varchar)";

        String sql = "CREATE TABLE student " +
                "(roll_number INTEGER not NULL, " +
                " name VARCHAR(255), " +
                " section VARCHAR(255), " +
                " city VARCHAR(255), " +
                " PRIMARY KEY ( roll_number ))";

        statement = DatabaseConnection.connection.createStatement();

        statement.executeUpdate(sql);
        System.out.println("Table created successfully");
        DatabaseConnection.closeConnection();
    }

    PreparedStatement preparedStatement;

    public void insertDataToTable() throws SQLException {
        DatabaseConnection.getConnectionWithDatabase();

        String insertQuery = "INSERT INTO student VALUES (?,?,?,?)";
        preparedStatement = DatabaseConnection.connection.prepareStatement(insertQuery);

        preparedStatement.setInt(1, rollNumber);
        preparedStatement.setString(2, name);
        preparedStatement.setString(3, section);
        preparedStatement.setString(4, city);

        preparedStatement.executeUpdate();

        System.out.println("Inserted data");
        DatabaseConnection.closeConnection();
    }

    public void updateStudent() throws SQLException {
        DatabaseConnection.getConnectionWithDatabase();

        String updateQuery = "UPDATE student SET name = ? where roll_number = ?";
        preparedStatement = DatabaseConnection.connection.prepareStatement(updateQuery);

        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, rollNumber);

        preparedStatement.executeUpdate();

        System.out.println("Data updated successfully");

        DatabaseConnection.closeConnection();
    }

    public void deleteStudentByid(int id) throws SQLException {
        DatabaseConnection.getConnectionWithDatabase();
        String deleteQuery = "DELETE from student where roll_number = ?";

        preparedStatement = DatabaseConnection.connection.prepareStatement(deleteQuery);

        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
        System.out.println("Record deleted successfully");
        DatabaseConnection.closeConnection();
    }

    public void read() throws SQLException {
        DatabaseConnection.getConnectionWithDatabase();
        String deleteQuery = "select * from student";

        statement = DatabaseConnection.connection.createStatement();

        ResultSet resultSet = statement.executeQuery(deleteQuery);

        while (resultSet.next()){
            System.out.print("roll num : "+ resultSet.getString(2));
        }

        System.out.println("Record successfully");
        DatabaseConnection.closeConnection();
    }




}
