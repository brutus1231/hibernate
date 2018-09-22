package pl.sda.jpa.util;


import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class HibernateUtil {

    private final EntityManagerFactory entityManagerFactory
            = Persistence.createEntityManagerFactory
            ( "manager1" );
    private final EntityManager entityManager
            = entityManagerFactory.createEntityManager();
    private static HibernateUtil instance;

    public HibernateUtil() {
    }

    public static HibernateUtil getInstance() {
        if (instance == null) {
            instance = new HibernateUtil();
        }
        return instance;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    //sesja JPA
    public void save(Object t) {
        entityManager.getTransaction().begin();
        entityManager.persist( t );
        entityManager.getTransaction().commit();
    }

    //dodatkowy mechanizm hibernate
    // robi to samo co metoda wyżej
    public void saveWithHibernateSession(Object t) {
        Session session = entityManager.unwrap(Session.class);
        session.getTransaction().begin();
        session.persist( t );
        session.getTransaction().commit();
    }

    public void close() {
        entityManager.close();
        entityManagerFactory.close();
    }
}