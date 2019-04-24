import entity.*;
import enums.Days;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        try(SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
            Session session = sessionFactory.openSession()){
            session.beginTransaction();
            Adress adress = new Adress("Lenin", 35);
            session.save(new Student("Valera", Days.MONDEY, 5, adress));
            session.save(new Student("Sergey", Days.THISDAY, 7, adress));
            session.save(new Student("Ignat", Days.WENSDAY, 4, adress));
            session.getTransaction().commit();
        }


    }
}
