package pl.sda.jpa.model;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Osoba2 {

    @Id
    @GeneratedValue
    @Column(name = "PERSON_ID")
    private Long id;

    @Column(name = "PHONE_NUMBER", length = 50)
    private String phoneNumber;

    @Column(name = "EMAIL", length = 100)
    private String email;

    Osoba2(){
    }

    Osoba2(String phoneNumber, String email) {
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
