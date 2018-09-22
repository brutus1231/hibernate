package pl.sda.jpa.model;



import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@Table(name = "DEPARTMENT")
public class Department implements Serializable {
    private static final long serialVersionUID = 232110525334L;

    @Id
    @GeneratedValue
    @Column(name = "DEPARTMENT_ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "department")
    private Set<Worker> workers;
}

