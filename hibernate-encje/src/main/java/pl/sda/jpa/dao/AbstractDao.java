package pl.sda.jpa.dao;

import pl.sda.jpa.util.HibernateUtil;

import javax.persistence.EntityManager;

public class AbstractDao {

    final HibernateUtil hibernateUtil = HibernateUtil.getInstance();
    final EntityManager entityManager = HibernateUtil.getInstance().getEntityManager();
}
