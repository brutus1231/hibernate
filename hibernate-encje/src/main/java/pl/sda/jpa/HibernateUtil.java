package pl.sda.jpa;


import com.mysql.cj.xdevapi.SessionFactory;
import com.sun.xml.internal.ws.handler.HandlerException;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {
    private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("manager1");
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
        entityManager.persist(t);
        entityManager.getTransaction().commit();

    }

    public void saveWithHibernateSession(Object t) {
        try {

            Session session = entityManager.unwrap(Session.class);
            session.getTransaction().begin();
            session.save(t);
            session.getTransaction().commit();
        } catch (HandlerException he) {
            he.printStackTrace();
        }
    }
        public void close() {
            entityManager.close();
            entityManagerFactory.close();
        }

    }

