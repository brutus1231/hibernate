package pl.sda.jpa.model;

import javax.persistence.*;
import java.util.Date;
import java.util.TreeMap;

@Entity
@Table(name = "PERSON")
public class Person {


    @Id
    @GeneratedValue
    @Column(name = "PERSON_ID", updatable = false, nullable = false)
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Temporal(TemporalType.DATE)
    @Column(name = "BIRTH_DATE")
    private Date birthDate;

    @OneToOne
    @JoinColumn(name = "ADDRESS_ID")
    private Address address;



}
