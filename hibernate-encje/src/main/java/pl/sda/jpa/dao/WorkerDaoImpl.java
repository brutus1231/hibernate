package pl.sda.jpa.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import pl.sda.jpa.model.Department;
import pl.sda.jpa.model.Worker;
import pl.sda.jpa.util.HibernateUtil;

import javax.persistence.Query;
import java.util.Date;
import java.util.List;

public class WorkerDaoImpl extends AbstractDao {

    public void create(String firstName, String lastName,
                       Integer age, Date hireDate, Department department) {
        Worker worker = Worker.create(firstName, lastName, age, hireDate, department);
        hibernateUtil.save(worker);
    }

    //zapytanie w JPA Query Language
    public List<Worker> list() {
        final String query = "Select w from Worker w";
        return entityManager.createQuery(query).getResultList();
    }

    //hibernate qery language
    public List<Worker> hqlList() {
        final String query = "Select w from Worker w";
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery(query).list();
    }

    public void delete(Long workerId) {
        HibernateUtil.getInstance().delete(workerId, Worker.class);
//        entityManager.getTransaction().begin();
        // usuwanie zapytaniem działą
//        final String query = "delete from Worker where  id = ?1";
//        Query entityManagerQuery = entityManager.createQuery(query);
//        entityManagerQuery.setParameter(1, workerId);
//        entityManagerQuery.executeUpdate();
//
//
//        Worker worker = entityManager.find(Worker.class, workerId);
//        entityManager.remove(worker);
//        entityManager.getTransaction().commit();
    }

    public void deleteHql(Long workerId) {
        Session session = entityManager.unwrap(Session.class);
        Transaction transaction = session.getTransaction();
        transaction.begin();
        Worker worker = session.find(Worker.class, workerId);
        session.delete(worker);
        transaction.commit();
    }
}
