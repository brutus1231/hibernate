package pl.sda.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "OSOBA_PRAWNA2")
public class OsobaPrawna2 extends Osoba2 {

    @Column(name = "NAME", length = 20)
    private String name;

    @Column(name = "NIP", length = 20)
    private String nip;

    @Column(name = "regon", length = 20)
    private String regon;

    @Column(name = "KRS", length = 20)
    private String krs;

    public OsobaPrawna2(String phoneNumber, String email, String name,
                        String nip, String regon, String krs) {
        super(phoneNumber, email);
        this.name = name;
        this.nip = nip;
        this.regon = regon;
        this.krs = krs;
    }
}
