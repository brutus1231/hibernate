package pl.sda.jpa.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import pl.sda.jpa.model.Department;
import pl.sda.jpa.model.Worker;
import pl.sda.jpa.util.HibernateUtil;

import java.util.Date;
import java.util.List;

public class WorkerDaoImpl extends AbstractDao {

    public void create(String firstName, String lastName,
                      Integer age, Date hireDate, Department department) {
        Worker worker = Worker.create(firstName, lastName, age, hireDate, department);
        hibernateUtil.save(worker);
    }

    public List<Worker> list() {
        final String query = "Select w from Worker w";
        return entityManager.createQuery(query).getResultList();
    }

    public List<Worker> hqlList(){
        final String query = "Select w from Worker w";
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery(query).list();
    }

    public void delete(Long workerId) {
        HibernateUtil.getInstance().delete(workerId, Worker.class);
    }

    public void hqlDelete(Long workerId) {
        Session session = entityManager.unwrap(Session.class);
        Transaction transaction = session.getTransaction();
        transaction.begin();
        Worker worker = session.find(Worker.class, workerId);
        session.delete(worker);
        transaction.commit();
    }
}
