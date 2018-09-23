package pl.sda.jpa.model;

import javax.persistence.*;

@Entity
@Table(name = "ADDRESS")
public class Address {

    @Id
    @GeneratedValue
    @Column(name = "ADDRESS_ID", updatable = false, nullable = false)
    private long id;

    @Column(name = "CITY", length = 50)
    private String city;

    @Column(name = "HOUSE_AND_FKAT_NUMER", length = 50)
    private String houseAndFlatNumber;

    @Column(name = "POSTAL_CODE")
    private String postalCODE;

    @OneToOne(mappedBy = "address")
    private Person person;
}
