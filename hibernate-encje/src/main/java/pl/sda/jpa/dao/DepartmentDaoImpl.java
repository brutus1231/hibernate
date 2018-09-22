package pl.sda.jpa.dao;

import org.hibernate.Session;
import pl.sda.jpa.model.Department;
import pl.sda.jpa.model.Worker;
import pl.sda.jpa.util.HibernateUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.Date;
import java.util.List;

public class DepartmentDaoImpl {
//    private final EntityManagerFactory entityManagerFactory
//            = Persistence.createEntityManagerFactory
//            ( "manager1" );
//    private final EntityManager entityManager
//            = entityManagerFactory.createEntityManager();

    public List<Department> list(){
//
//        String jpql = "select d from DEPARTMENT d";
//        TypedQuery query = entityManager.createQuery(jpql, String.class);
//

  //      return (List<Department>) query.getSingleResult();
    return null;
    }
    public void delete(Long id){



    }


    public void add (String departmentName){
        HibernateUtil hibernateUtil = HibernateUtil.getInstance();
        hibernateUtil.save(new Department (departmentName));
    //    hibernateUtil.close();
    }
}



