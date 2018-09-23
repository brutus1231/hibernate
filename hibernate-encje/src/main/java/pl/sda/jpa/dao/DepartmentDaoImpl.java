package pl.sda.jpa.dao;

import pl.sda.jpa.model.Department;
import pl.sda.jpa.model.Worker;
import pl.sda.jpa.util.HibernateUtil;

import java.util.List;

public class DepartmentDaoImpl extends AbstractDao {

    public List<Department> list() {
        return entityManager.createQuery("Select d from Department d").getResultList();
    }

    public void create(String name) {
        Department department = new Department(name);
        hibernateUtil.save(department);
    }

    public void delete(Long departmentId) {
        HibernateUtil.getInstance().delete(departmentId, Department.class);
    }

}
