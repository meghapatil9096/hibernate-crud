package service;

import entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateStudent {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

//      ----------Update Operation-----------------------------------------
        Student student1 = (Student)session.get(Student.class, 2);
        student1.setMarks(83);

        session.update(student1);
        transaction.commit();

        session.close();
        sessionFactory.close();
    }
}
