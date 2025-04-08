package service;

import entities.Student;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class SelectStudent {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();

//      ------------------Select Operation--------------------------------------
        Query query = session.createQuery(" from Student");
        List<Student> std1 = query.list();
        for (Student std2 : std1)
        {
            System.out.println("Id>>"+std2.getId());
            System.out.println("Name>>"+std2.getName());
            System.out.println("Marks>>"+std2.getMarks());
        }
        session.close();
        sessionFactory.close();
    }
}
