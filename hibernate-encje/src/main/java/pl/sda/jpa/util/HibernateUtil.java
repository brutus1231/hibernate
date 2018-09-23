package pl.sda.jpa.util;

import org.hibernate.Session;
import org.hibernate.Transaction;
import pl.sda.jpa.model.Worker;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {

    private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
    private final EntityManager entityManager = entityManagerFactory.createEntityManager();
    private static HibernateUtil instance;

    private HibernateUtil() {
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

    public void save(Object t) {
        entityManager.getTransaction().begin();
        if (!entityManager.contains(t)) {
            entityManager.persist(t);
            entityManager.flush();
        }
        entityManager.getTransaction().commit();
    }

    public void saveByHibernateSession(Object t) {
        Session session = entityManager.unwrap(Session.class);
        Transaction tx = session.beginTransaction();
        session.save(t);
        tx.commit();
        session.close();
    }
    public void close() {
        entityManager.close();
        entityManagerFactory.close();
    }

    public void delete(Long objectId, Class clazz) {

        entityManager.getTransaction().begin();
        Object toRemove = entityManager.find(clazz, objectId);
        entityManager.remove(toRemove);
        entityManager.getTransaction().commit();
    }
}
