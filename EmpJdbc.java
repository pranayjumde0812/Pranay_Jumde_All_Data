import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

 public class EmpJdbc {
    public static void main (String [] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded Successfully");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","root","1311");
            System.out.println("Database Connected Successfully");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from login1");
//            while (rs.next()){
//                System.out.println(rs.getString("id")+" uname "+rs.getString("uname")+" upass "+rs.getString("upass"));
//            }
//            int r=st.executeUpdate("INSERT INTO login1 VALUE (7,'PRANAY','1308')");
//            System.out.println(r);
          }

        catch (Exception e){
            System.out.println(e);
        }
    }
}
