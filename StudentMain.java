import jakarta.persistence.*;

import java.util.Date;

public class StudentMain {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("default");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction transaction=entityManager.getTransaction();
        transaction.begin();
        Student stu=new Student();
        stu.setName("Pranay");
        stu.setDate(new Date());
        entityManager.persist(stu);

        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
