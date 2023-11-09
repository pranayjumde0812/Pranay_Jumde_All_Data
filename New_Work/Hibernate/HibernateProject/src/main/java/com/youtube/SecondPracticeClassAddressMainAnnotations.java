package com.youtube;

import com.entity.Address;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

public class SecondPracticeClassAddressMainAnnotations {

    public static void main(String[] args) throws IOException {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Address address = new Address();

        address.setCity("Nagpur");
        address.setOpen(true);
        address.setX(200.00);

        address.setAddedDate(new Date());

        // Now we are storing image into database

        FileInputStream fis = new FileInputStream("src/main/java/img/TeamBackground.png");

        byte[] imgData = new byte[fis.available()];
        fis.read(imgData);
        //////////////////////////

        address.setImage(imgData);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        // Saving Object student Object to database

        session.save(address);

        transaction.commit();
        System.out.println("Successfully inserted to database!!!");
        session.close();
    }
}
