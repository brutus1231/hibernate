package pl.sda.jpa.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "WORKER")
public class Worker implements Serializable {

    private static final long serialVersionUID = 2010120128336171270L;

    @Id
    @GeneratedValue
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
    @JoinColumn(name = "DEPARTAMENT_ID", nullable = false)
    private Department department;

    private Worker(){

    }

    private Worker(String firstName, String lastName, Integer age, Date hireDate, Department department){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hireDate = hireDate;
        this.department = department;

    }


    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public static Worker create(String firstName, String lastName, Integer age, Date hireDate, Department department) {
        return new Worker(firstName, lastName, age, hireDate, department);


    }

    public String toString(){
        return this.firstName + " " + this.lastName + " " + this.hireDate;
    }
}
