package pl.sda.jpa.model;

import javax.persistence.*;

@Entity
@Table(name = "OSOBA")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "PERSON_TYPE",
        discriminatorType = DiscriminatorType.STRING)
public abstract class Osoba {

    @Id
    @GeneratedValue
    @Column(name = "PERSON_ID")
    private Long id;

    @Column(name = "PHONE_NUMBER", length = 50)
    private String phoneNumber;

    @Column(name = "EMAIL", length = 100)
    private String email;

    Osoba(){
    }

    Osoba(String phoneNumber, String email) {
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
