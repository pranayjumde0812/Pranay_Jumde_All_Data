package com.youtube;

import com.youtube.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDataFromDatabase {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        // Fetch student with get() method
        Student student = session.get(Student.class, 111);
        System.out.println(student);

        Student student4 = session.get(Student.class, 111);
        System.out.println(student4); // if we load information already for this same id then it will return data from cache and does not execute query

        Student student1 = session.get(Student.class, 113);
        System.out.println(student1); // return null if we provide wrong id



        // Fetch student with load() method
        // lazy initialization
        Student student2 = session.load(Student.class, 101);
        System.out.println(student2);

        Student student3 = session.load(Student.class, 106);
        System.out.println(student3); // If Student is not available in DB it gives ObjectNotFoundException


        session.close();
        sessionFactory.close();
    }
}
