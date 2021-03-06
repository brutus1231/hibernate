package pl.sda.jpa.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "WORKER")
public class Worker implements Serializable {

    private static final long serialVersionUID = 2010120128336171270L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "WORKER_ID", updatable = false, nullable = false)
    private Long id;

    @Column(name = "FIRST_NAME", length = 50)
    private String firstName;

    @Column(name = "LAST_NAME", length = 50)
    private String lastName;

    @Column(name = "AGE")
    private Integer age;

    @Temporal(TemporalType.DATE)
    @Column(name = "HIRE_DATE", nullable = false)
    private Date hireDate;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "DEPARTAMENT_ID", nullable = false,
            foreignKey = @ForeignKey(name = "fk_worker_dept"))
    private Department department;

    Worker() {
    }

    private Worker(String firstName, String lastName,
                   Integer age, Date hireDate, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hireDate = hireDate;
        this.department = department;
    }

    public static Worker create(String firstName, String lastName,
                                Integer age, Date hireDate, Department department) {
        return new Worker(firstName, lastName, age, hireDate, department);
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.hireDate;
    }
}
