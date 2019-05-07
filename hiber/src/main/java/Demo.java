import entity.*;
import enums.Days;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
//        try(SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
//            Session session = sessionFactory.openSession()){
//            session.beginTransaction();
//            Adress adress = new Adress("Lenin", 35);
//            session.save(new Student("Valera", Days.MONDEY, 5, adress));
//            session.save(new Student("Sergey", Days.THISDAY, 7, adress));
//            session.save(new Student("Ignat", Days.WENSDAY, 4, adress));
//            session.getTransaction().commit();
//        }

        try(SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
            Session session = sessionFactory.openSession()){
            session.beginTransaction();

            HomeAddress homeAddress = new HomeAddress("Lenin");
            List<HomeAddress> list = new ArrayList<>();
            list.add(homeAddress);
            list.add(new HomeAddress("Gukova"));
            list.add(new HomeAddress("Marksa"));
            List<Integer> listint = new ArrayList<>();
            listint.add(1);
            listint.add(5);
            Person person = new Person("Max", list, listint);

            List<HomeAddress> list1 = new ArrayList<>();
            list1.add(new HomeAddress("Sovetskaya"));
            list1.add(new HomeAddress("Chuy"));
            list1.add(new HomeAddress("Belinka"));
            List<Integer> listint1 = new ArrayList<>();
            listint1.add(8);
            listint1.add(74);
            listint1.add(15);
            Person person1 = new Person("Feder", list1, listint1);

//            session.persist(homeAddress);
            session.persist(person);
            session.persist(person1);

            session.getTransaction().commit();
        }


    }
}
