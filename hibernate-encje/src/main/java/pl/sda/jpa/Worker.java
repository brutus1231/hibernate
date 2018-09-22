package pl.sda.jpa;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Worker")


public class Worker implements Serializable {
    private static final long serialVersionUID = 232110525334L;
    @Id
    @GeneratedValue
    @Column(name = "worker_id")
    private String worker_id;


    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "age")
    private int age;


    @Temporal(TemporalType.DATE)
    @Column(name = "hire_data")
    private Date hire_data;


    @ManyToOne
    private Department department;


}