package pl.sda.jpa;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
                EntityManagerFactory entityManagerFactory =
                        Persistence.createEntityManagerFactory("manager1");
                EntityManager entityManager = entityManagerFactory.createEntityManager();

                Department department = new Department("Damiana Chata");

                entityManager.close();
                entityManagerFactory.close();



    }
}
