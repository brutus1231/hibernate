package pl.sda.jpa;


import pl.sda.jpa.dao.DepartmentDaoImpl;
import pl.sda.jpa.dao.WorkerDaoImpl;
import pl.sda.jpa.model.Department;
import pl.sda.jpa.model.Worker;
import pl.sda.jpa.util.HibernateUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//
//        EntityManagerFactory entityManagerFactory =
//                Persistence.createEntityManagerFactory
//                        ( "manager1" );
//
//        EntityManager entityManager = entityManagerFactory.createEntityManager();

        HibernateUtil hibernateUtil = new HibernateUtil();
        DepartmentDaoImpl departmentDao = new DepartmentDaoImpl();
        WorkerDaoImpl workerDao = new WorkerDaoImpl();





        Scanner scanner = new Scanner( System.in );

        int choice = 0;

        while (choice!=7) {
            System.out.println( "wybierz działanie:\n" +
                    "1. dodaj nowy departament\n" +
                    "2. dodaj nowego pracownika\n" +
                    "3. wypisz departamenty\n" +
                    "4. wypisz pracowników\n" +
                    "5. usuń pracownika\n" +
                    "6. usuń departament\n + " +
                    "7. exit" );
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println( "test" );
                    String test = scanner.nextLine();
                    System.out.println( "podaj nazwę departamentu" );
                    String nazwaDepartamentu = scanner.nextLine();
                    departmentDao.add( nazwaDepartamentu );
                    //   hibernateUtil.save(  );
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println( departmentDao.list() );


                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    hibernateUtil.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println( "niewłaściwy wybór" );
            }
        }


//        entityManager.close();
//        entityManagerFactory.close();




    }
}
/*
- dodaj nowy departament
- zapisz nowego pracownika
- wypisz departamenty
- wypisz pracowników
- usuń pracownika
- usuń departament (usuwamy razem pracowników w danym departamencie)
 */


