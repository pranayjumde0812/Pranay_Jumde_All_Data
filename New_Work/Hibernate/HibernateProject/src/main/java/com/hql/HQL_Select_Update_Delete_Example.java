package com.hql;

import com.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class HQL_Select_Update_Delete_Example {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();


        Session session = sessionFactory.openSession();

        Student student1 = new Student();
        student1.setStudentId(2);
        student1.setName("Mayur");
        student1.setCity("Koradi");

        session.save(student1);

        System.out.println("Inserted successfully");

        // HQL
        // Syntax
        String query = "from Student as s where s.city =: city and  s.name =: name";

        Query q = session.createQuery(query);

        q.setParameter("city", "Mahal");
        q.setParameter("name", "Bharti");

        // single - unique();
        // Student std = (Student) q.uniqueResult();

        // multiple - list()
        List<Student> list = q.list();

        for (Student student : list) {
            System.out.println(student.getName());
        }

        System.out.println("------------------------------------------------");

        Transaction tx = session.beginTransaction();
        // Delete query
//        String deleteHqlQuery = "delete from Student as s where s.city =: c";
//
//        Query query1 = session.createQuery(deleteHqlQuery);
//        query1.setParameter("c", "Nagpur");
//
//        int rows = query1.executeUpdate();
//
//        System.out.println(rows + " records are deleted ");


        System.out.println("------------------------------------------------------");
        // Update Query
        String deleteHqlQuery = "update Student as s set s.name =: name where s.city =: city";

        Query query1 = session.createQuery(deleteHqlQuery);
        query1.setParameter("name","Ram");
        query1.setParameter("city", "Mahal");

        int rows = query1.executeUpdate();

        System.out.println(rows + " records are updated ");
        tx.commit();
        sessionFactory.close();
    }
}
