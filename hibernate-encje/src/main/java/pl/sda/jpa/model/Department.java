package pl.sda.jpa.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "DEPARTMENT")
public class Department implements Serializable {

        private static final long serialVersionUID = 232110525334L;

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name="DEPARTMENT_ID")
        private Long id;

        @Column(name = "NAME", nullable = false)
        private String name;


    }







//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name="DEPARTMENT_ID")
//    private int department_id;
//
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name="NAME")
//    private String name;
