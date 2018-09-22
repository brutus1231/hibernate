package pl.sda.jpa;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "WORKER")
public class Worker implements Serializable {
    private static final long serialVersionUID = 232110525334L;

    @Id
    @GeneratedValue
    @Column(name = "WORKER_ID")
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "AGE")
    private int age;

    @Temporal(TemporalType.DATE)
    @Column(name = "HIRE_DATE")
    private Date hireDate;

    @ManyToOne
    private Department department;

}
