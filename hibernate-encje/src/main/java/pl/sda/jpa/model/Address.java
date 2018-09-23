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

    @Column(name = "STREET", length = 50)
    private String street;

    @Column(name = "HOUSE_FLAT)NUMBER", length = 50)
    private String houseFlatNumber;

    @Column(name = "POSTAL_CODE")
    private String postalCode;

    @OneToOne(mappedBy = "address")
    private Person person;

}
