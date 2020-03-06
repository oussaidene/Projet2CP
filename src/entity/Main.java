package entity;

// TODO: discuss column names of MySQL database

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
            Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

            SessionFactory factory = meta.getSessionFactoryBuilder().build();
            Session session = factory.openSession();

            Transaction t = session.beginTransaction();

            Employe e = new Employe();
            e.setNom("Hassani");
            e.setPrénom("Mourad");
            e.setDateNaissance(LocalDate.of(2001, 1, 9));
            e.setSalaire(500000);
            e.setService("TEST");

            session.persist(e);

            t.commit();
            session.close();
            System.out.println("success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
