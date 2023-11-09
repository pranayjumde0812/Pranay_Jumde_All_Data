import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

//        Student.createStudentTable();


//        Student student = new Student();
//        student.setRollNumber(1);
//        student.setName("Pranay");
//        student.setSection("B");
//        student.setCity("Koradi");
//
//        student.insertDataToTable();


//        Student student1 = new Student();
//        student1.setRollNumber(2);
//        student1.setName("Shubham");
//        student1.setSection("B");
//        student1.setCity("NGP");
//
//        student1.insertDataToTable();

        Student student2 = new Student();
        student2.setRollNumber(2);
        student2.setName("Shubham");
//
//        student2.updateStudent();

        student2.deleteStudentByid(2);

        student2.read();
    }
}