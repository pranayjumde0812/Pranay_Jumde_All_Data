package com.youtube;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Project Started !!!!!");

//        Configuration con = new Configuration();
//
//        con.configure("hibernate.cfg.xml");
//
//        SessionFactory sessionFactory = con.buildSessionFactory();

        SessionFactory sessionFactory = new Configuration()
                .configure("Hibernate_1/src/main/java/hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        System.out.println(session);
        sessionFactory.close();

    }
}
