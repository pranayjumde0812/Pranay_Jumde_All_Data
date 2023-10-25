package com.youtube;

import com.youtube.entity.Employee;
import com.youtube.entity.Salary;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ThirdPracticeClassForUsingEmbaddbleAnotation {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();


        //  Storing Employee Data to DB

        Employee employee = new Employee();
        employee.setName("{Pavan");
        employee.setCity("Khapri");

        // Now we have to store Salary details

        Salary salary = new Salary();
        salary.setSalaryId(1111);
        salary.setSalary(120000);

        employee.setSalary(salary);

        session.save(employee);
        transaction.commit();

        System.out.println("Successfully inserted to database!!!");
        session.close();
    }
}
