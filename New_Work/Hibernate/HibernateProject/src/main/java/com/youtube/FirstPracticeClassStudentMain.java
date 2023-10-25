package com.youtube;

import com.youtube.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FirstPracticeClassStudentMain {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Student student = new Student();
        student.setStudentId(101);
        student.setName("Pranay");
        student.setCity("Nagpur");

        Student student1 = new Student();
        student1.setStudentId(111);
        student1.setName("Bharti");
        student1.setCity("Mahal");

        System.out.println(student);
        System.out.println(student1);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        // Saving Object student Object to database

        session.save(student);
        session.save(student1);

        transaction.commit();

        System.out.println("Successfully inserted to database!!!");
        session.close();
    }
}
