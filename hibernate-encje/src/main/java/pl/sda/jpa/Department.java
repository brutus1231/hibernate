package pl.sda.jpa;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@Table(name = "Department")


public class Department implements Serializable {
    private static final long serialVersionUID = 232110525334L;


    @Id
    @GeneratedValue
    @Column(name = "department_id")
    private Long department_id;

    @Column(name = "name")
    private Long name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "department")
    private Set<Worker> workers;




}
