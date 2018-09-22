package pl.sda.jpa;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;



@Entity
@Table (name = "TAB_DEPARTAMENT")
public class Department implements Serializable  {
    private static final long serialVersionUID = 232110525334L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "DEPARTMENT_ID")
    private Long departmentid;

    @Column(name = "NAME")
    private String departmentname;

    public Department(String departmentname) {
        this.departmentname = departmentname;
    }
}


