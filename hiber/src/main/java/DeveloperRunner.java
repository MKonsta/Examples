import entity.Developer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class DeveloperRunner {
    private static SessionFactory sessionFactory;

    public void addDeveloper(String firstName, String lastName, String specialty, int expirience) {
        Session session = sessionFactory.openSession();
        System.out.println("gggggggggggggggggggg");
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Developer developer = new Developer(firstName, lastName, specialty, expirience);
        session.save(developer);
        transaction.commit();
        session.close();
    }

//    public List<Developer> listDeveloper() {
//        Session session = sessionFactory.openSession();
//        Transaction transaction = null;
//
//        transaction = session.beginTransaction();
//        List<Developer> developers = session.createQuery("from Developer", Developer.class).list();
//
//        transaction.commit();
//        session.close();
//
//        return developers;
//
//    }

    public static void main(String[] args) {
        DeveloperRunner developerRunner = new DeveloperRunner();

        developerRunner.addDeveloper("Fred", "Semenov", "Java", 4);
    }
}
