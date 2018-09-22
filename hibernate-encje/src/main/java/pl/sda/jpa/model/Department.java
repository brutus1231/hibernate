package pl.sda.jpa.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "DEPARTMENT")
//@NamedQuery(name = "list2", query = "select d from Department d")
public class Department {

    @Id
    @GeneratedValue
    @Column(name = "DEPARTMENT_ID", updatable = false, nullable = false)
    private Long id;

    @Column(name = "NAME", length = 50)
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "department")
    private Set<Worker> workers;

    protected Department() {
    }

    private Department(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(Set<Worker> workers) {
        this.workers = workers;
    }

    public static Department create(String name) {
        return new Department(name);
    }
}
