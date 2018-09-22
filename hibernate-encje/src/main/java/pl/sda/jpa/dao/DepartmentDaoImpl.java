package pl.sda.jpa.dao;

import pl.sda.jpa.model.Department;
import pl.sda.jpa.util.HibernateUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class DepartmentDaoImpl {

    private final EntityManager entityManager = HibernateUtil.getInstance().getEntityManager();

    public List<Department> list() {
        return entityManager.createQuery("Select d from Department d").getResultList();
    }

    public void delete(Long id) {
        Department employee = entityManager.find(Department.class, 1);
        entityManager.getTransaction().begin();
        entityManager.remove(employee);
        entityManager.getTransaction().commit();
    }

}
