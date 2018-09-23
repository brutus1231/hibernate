package pl.sda.jpa.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PRAWNA")
public class OsobaPrawna extends Osoba {

    @Column(name = "NAME", length = 20)
    private String name;

    @Column(name = "NIP", length = 20)
    private String nip;

    @Column(name = "REGON", length = 20)
    private String regon;

    @Column(name = "KRS", length = 20)
    private String krs;

    OsobaPrawna(String phoneNumber, String email) {
        super(phoneNumber, email);
    }

    public OsobaPrawna(String phoneNumber, String email, String name, String nip, String regon, String krs) {
        super(phoneNumber, email);
        this.name = name;
        this.nip = nip;
        this.regon = regon;
        this.krs = krs;
    }
}
