package pl.sda.jpa;

import pl.sda.jpa.model.Department;
import pl.sda.jpa.util.HibernateUtil;

public class Main {
    public static void main(String[] args) {

        HibernateUtil hibernateUtil = HibernateUtil.getInstance();
        Department department = Department.create("INFORMATYKA");
        hibernateUtil.save(department);

//        DepartmentDaoImpl dao = new DepartmentDaoImpl();
//        for(Department dp : dao.list()){
//            System.out.println(dp.getId() + " " + dp.getName());
//        }
        hibernateUtil.close();
    }
}
