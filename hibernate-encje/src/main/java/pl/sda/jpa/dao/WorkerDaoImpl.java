package pl.sda.jpa.dao;

import pl.sda.jpa.model.Department;
import pl.sda.jpa.model.Worker;

import java.util.Date;

public class WorkerDaoImpl extends AbstractDao {

    void createWorker(String firstName, String lastName,
                      Integer age, Date hireDate, Department department){
        Worker worker = Worker.create(firstName, lastName, age, hireDate, department);
    }
}
