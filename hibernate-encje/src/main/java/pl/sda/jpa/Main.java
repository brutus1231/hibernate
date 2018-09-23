package pl.sda.jpa;

import pl.sda.jpa.bo.DepartmentBoImpl;
import pl.sda.jpa.bo.WorkerBoImpl;
import pl.sda.jpa.dao.WorkerDaoImpl;
import pl.sda.jpa.model.Department;
import pl.sda.jpa.util.HibernateUtil;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

//        DepartmentDaoImpl departamentDao = new DepartmentDaoImpl();
//        departamentDao.create("IT5");

        WorkerDaoImpl workerDao = new WorkerDaoImpl();
        Department department = new Department("INFORMATYKA2");
        workerDao.create("Marta2", "Bagińska2", 25, new Date(), department);

        WorkerBoImpl workerBo = new WorkerBoImpl();
        DepartmentBoImpl departmentBo = new DepartmentBoImpl();
//
//       departmentBo.delete(1L);
//        bo.list();

//        bo.delete();
//        bo.delete(3L);
        HibernateUtil.getInstance().close();

    }
}
