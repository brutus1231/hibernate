package pl.sda.jpa;

import pl.sda.jpa.dao.DepartmentDaoImpl;
import pl.sda.jpa.dao.WorkerDaoImpl;
import pl.sda.jpa.model.Department;
import pl.sda.jpa.util.HibernateUtil;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

//        DepartmentDaoImpl departamentDao = new DepartmentDaoImpl();
//        departamentDao.create("IT3");

        WorkerDaoImpl workerDao = new WorkerDaoImpl();

        Department department = new Department("nowy department");
        workerDao.create("Marek", "Nowak", 30, new Date(), department);
        HibernateUtil.getInstance().close();

    }
}
