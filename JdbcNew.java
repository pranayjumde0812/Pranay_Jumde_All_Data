import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcNew {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","root","1311");
            System.out.println("Database connected successfully");
            Statement st =con.createStatement();
            ResultSet rs;


//            Scanner sc=new Scanner(System.in);
//            System.out.print("Enter ID: ");
//            int uid= sc.nextInt();
//            System.out.print("Enter Username: ");
//            String uName=sc.next();
//            System.out.print("Enter Password: ");
//            String uPass=sc.next();

            int uid;
            int up;
            String uName,uPass;
            Scanner sc=new Scanner(System.in);

            System.out.println("Menu");
            System.out.println("Select 1 for to display Full Table");
            System.out.println("Select 2 for Insert ");
            System.out.println("Select 3 for Update");
            System.out.println("Select 4 for Delete");

            int option=sc.nextInt();

            switch(option)
            {
                case 1:
                     rs=st.executeQuery(" SELECT * FROM work");
                     while (rs.next()){
                     System.out.println("id : "+rs.getString("id")+" uname: "+rs.getString("Uname")+" upass: "+rs.getString("Upass"));
                   }
                    break;
                case 2:
                    System.out.print("Enter ID: ");
                    uid= sc.nextInt();
                    System.out.print("Enter Username: ");
                    uName=sc.next();
                    System.out.print("Enter Password: ");
                    uPass=sc.next();
                    int r=st.executeUpdate("INSERT INTO work VALUES ("+uid+",'"+uName+"','"+uPass+"')");

                    break;
                case 3:
                    System.out.println("Enter the key for which you want to update");
                    System.out.println("Press 1 to update ID");
                    System.out.println("Press 2 to update User Name");
                    System.out.println("Press 3 to update User Password");

                    int choice=sc.nextInt();
                    int id;
                    String name,pass;
                    switch (choice)
                    {
                        case 1:
                            System.out.println("Enter User name for Which you want to Update the ID");
                            name=sc.next();

                                System.out.print("Enter Updated ID: ");
                                id = sc.nextInt();
                                up = st.executeUpdate("UPDATE work SET ID='" + id + "' WHERE UName='" + name + "'");
                                break;


                        case 2:
                            System.out.println("Enter User ID for Which you want to Update the User Name");
                            id= sc.nextInt();
                            System.out.print("Enter Updated User Name: ");
                            name= sc.next();
                            up=st.executeUpdate("UPDATE work SET uNAME='"+name+"' WHERE ID='"+id+"'");
                            break;

                        case 3:
                            System.out.println("Enter User ID for Which you want to Update the User Pass");
                            id= sc.nextInt();
                            System.out.print("Enter Updated User Pass: ");
                            pass= sc.next();
                            up=st.executeUpdate("UPDATE work SET uPass='"+pass+"' WHERE ID='"+id+"'");
                            break;
                    }
                case 4:
                    System.out.println("Enter the id which you want to delete the data");
                    int idd=sc.nextInt();
                    int del=st.executeUpdate("DELETE FROM work WHERE ID='"+idd+"'");
                    break;

            }

/////////////////////////////////// Hard Manual Code /////////////////////////////////////////
//            int r=st.executeUpdate("INSERT INTO work VALUES ("+uid+",'"+uName+"','"+uPass+"')");
//          //  int up=st.executeUpdate("UPDATE work SET Uname=''");
//            int de=st.executeUpdate("DELETE FROM work WHERE ID=5");
//
//            ResultSet rs=st.executeQuery(" SELECT * FROM work");
//            while (rs.next()){
//               System.out.println("id : "+rs.getString("id")+" uname: "+rs.getString("Uname")+" upass: "+rs.getString("Upass"));
//            }
///////////////////////////////////////////////////////////////////////////////////////////////

        }catch (Exception e){
            System.out.println(e);
        }
    }
}