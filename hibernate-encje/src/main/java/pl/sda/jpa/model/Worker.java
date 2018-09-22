package pl.sda.jpa.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "WORKER")
public class Worker implements Serializable {

    private static final long serialVersionUID = 232110525334L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="WORKER_ID")
    private Long worker_id;

    @Column(name = "FIRST_NAME", nullable = false)
    private String first_name;

    @Column(name = "LAST_NAME", nullable = false)
    private String last_name;

    @Column(name="AGE", nullable = false)
    private Long age;

    @Column(name="HIRE_DATE", nullable = false)
    private Date hire_date;

//    @Column(name="DEPARTMENT_ID")
//    @ManyToOne
//    private Long department_id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="DEPARTMENT_ID", nullable=false)
    Department department;


}



