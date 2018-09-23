package pl.sda.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "OSOBA_FIZYCZNA2")
public class OsobaFizyczna2 extends Osoba2 {

    @Column(name = "FIRST_NAME", length = 100)
    private String firstName;

    @Column(name = "LAST_NAME", length = 100)
    private String lastName;

    @Column(name = "PESEL", length = 11)
    private String pesel;

    @Column(name = "DOCUMENT_NUMBER", length = 50)
    private String documentNumber;

    public OsobaFizyczna2(String phoneNumber, String email, String firstName, String lastName, String pesel,
                          String documentNumber) {
        super(phoneNumber, email);
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.documentNumber = documentNumber;
    }
}
