package pl.sda.jpa.model;

import javax.persistence.*;
import javax.xml.crypto.Data;

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
    @Column(name = "BIRTH_DADE")
    private Data birthDate;
}
