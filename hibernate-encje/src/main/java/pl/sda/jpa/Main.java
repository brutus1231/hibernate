package pl.sda.jpa;

import pl.sda.jpa.bo.WorkerBolmpl;
import pl.sda.jpa.dao.DepartmentDaoImpl;
import pl.sda.jpa.dao.WorkerDaolmpl;
import pl.sda.jpa.model.Department;
import pl.sda.jpa.model.Worker;
import pl.sda.jpa.util.HibernateUtil;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
//
//        DepartmentDaoImpl departamentDao = new DepartmentDaoImpl();
//        departamentDao.create("IT2");

        WorkerDaolmpl workerDao = new WorkerDaolmpl();
        Department department = new Department("INFORMATYKA");
        workerDao.create("Marek", "Nowak", 30, new Date(), department);


//        WorkerBolmpl bo = new WorkerBolmpl();
//        bo.List();

        HibernateUtil.getInstance().close();

    }
}
