package pl.sda.jpa.bo;

import pl.sda.jpa.dao.DepartmentDaoImpl;

public class DepartmentBoImpl {

    private DepartmentDaoImpl dao = new DepartmentDaoImpl();

    public void  delete(Long departmentId){
        dao.delete(departmentId);
    }
}
