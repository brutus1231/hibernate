package pl.sda.jpa.model;


import javax.persistence.*;

@Entity
@Table(name = "ADDRESS")
public class Address {

    @Id
    @GeneratedValue
    @Column(name = "ADDRESS_ID", updatable = false, nullable = false)
    private Long id;

    @Column(name = "CITY", length = 50)
    private String city;

    @Column(name = "HAUSE_AND_FLAT_NUMBER", length = 50)
    private String houseAndFlatNumber;

    @Column(name = "STREET", length = 50)
    private String street;

    @Column(name = "POSTAL_CODE", length = 50)
    private String postalCode;

    //ustawia adres w adresie na obiekt konkretny z person przypisany przez relację w Address
    @OneToOne(mappedBy = "address")
    private Person person;
}
