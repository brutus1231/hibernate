package pl.sda.jpa.dao;

import pl.sda.jpa.model.Department;
import pl.sda.jpa.model.Worker;

import java.util.Date;
import java.util.List;

public class WorkerDaoImpl extends AbstractDao {

    public void create(String firstName, String lastName,
                      Integer age, Date hireDate, Department department){
        Worker worker = Worker.create(firstName, lastName, age, hireDate, department);
        hibernateUtil.save(worker);
    }

    //zapytanie w JPA Query Language
    public List<Worker> list(){
        final String query = "Select w from Worker w";
        return entityManager.createQuery(query).getResultList();
    }
}
