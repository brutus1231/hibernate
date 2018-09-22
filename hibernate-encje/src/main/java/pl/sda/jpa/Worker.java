package pl.sda.jpa;


import javax.persistence.*;
import javax.xml.crypto.Data;
import java.io.Serializable;

@Entity
@Table(name = "TAB_WORKER")
public class Worker implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "Worker_ID")
    private Long workerld;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEPARTMENT_ID", nullable = false)
    Department department;


}
