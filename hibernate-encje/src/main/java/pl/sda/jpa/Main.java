package pl.sda.jpa;

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
//        Department department = new Department("nowy");
//        workerDao.create("Marek", "Nowak", 30, new Date(), department);

        WorkerBoImpl bo = new WorkerBoImpl();
        bo.list();

        HibernateUtil.getInstance().close();
    }
}
