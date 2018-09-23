package pl.sda.jpa;

import pl.sda.jpa.bo.DepartmentBoImpl;
import pl.sda.jpa.bo.WorkerBoImpl;
import pl.sda.jpa.dao.DepartmentDaoImpl;
import pl.sda.jpa.dao.WorkerDaoImpl;
import pl.sda.jpa.model.Department;
import pl.sda.jpa.util.HibernateUtil;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

//        DepartmentDaoImpl departamentDao = new DepartmentDaoImpl();
//        departamentDao.create("IT2");
//        WorkerDaoImpl workerDao = new WorkerDaoImpl();
//        Department department = new Department("Informatyka");
//        workerDao.create("Marta", "Bagińska", 25, new Date(), department);
//
//        workerDao.create("Ma", "Ba", 40, new Date(), department);
//
//

//        WorkerBoImpl bo = new WorkerBoImpl();
//        bo.list();
//        bo.delete(4l);
//        bo.list();
//        System.out.println("po usunięciu");

        WorkerBoImpl workerBo = new WorkerBoImpl();
        DepartmentBoImpl departmentBo = new DepartmentBoImpl();
        departmentBo.delete(2l);
        HibernateUtil.getInstance().close();
    }
}
