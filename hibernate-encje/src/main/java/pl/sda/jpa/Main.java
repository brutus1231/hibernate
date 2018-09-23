package pl.sda.jpa;

import pl.sda.jpa.dao.DepartmentDaoImpl;
import pl.sda.jpa.model.Department;
import pl.sda.jpa.util.HibernateUtil;

public class Main {
    public static void main(String[] args) {

        DepartmentDaoImpl departamentDao = new DepartmentDaoImpl();
        departamentDao.create("IT2");



    }
}
