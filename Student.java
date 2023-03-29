import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Student {
@Id
@Column(name = "RollNumber")
    private int rollNO;

    private  String name;

    public int getRollNO() {
        return rollNO;
    }

    public void setRollNO(int rollNO) {
        this.rollNO = rollNO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Student.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Column(name = "Mail")
   static private String email;

    @Temporal(TemporalType.DATE)
   private Date date;

}
