package service;

import entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertStudent {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Student student1 = new Student();
        student1.setId(2);
        student1.setName("Anmol");
        student1.setMarks(77);

        session.save(student1);
        transaction.commit();
        session.close();
        sessionFactory.close();

    }
}
