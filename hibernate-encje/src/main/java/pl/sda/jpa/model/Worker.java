package pl.sda.jpa.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "worker")
public class Worker implements Serializable {
    private static final long serialVersionUID = 232110525334L;

    @Id
    @GeneratedValue
    @Column(name = "worker_id")
    private Long id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "age")
    private int age;

    @Temporal(TemporalType.DATE)
    @Column(name = "hire_date")
    private Date hire_date;

    @ManyToOne
    private Department department;

}
