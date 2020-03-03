package entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@DiscriminatorValue("pret_social")
public class PretSocial extends PretRemboursable {
    @Column(name = "type_social")
    // TODO: énumération type PretSocial
    private String typePret;

    public PretSocial(int id, Employe employe, int PV, LocalDate dateDemande, double somme, LocalDate dateDebut,
                      LocalDate dateProchain, double sommeRestante, int nbMois, String typePret) {
        super(id, employe, PV, dateDemande, somme, dateDebut, dateProchain, sommeRestante,
                nbMois);
        this.typePret = typePret;
    }

    // Overrided methods

    @Override
    public String toString() {
        return "PretSocial{" +
                "typePret='" + typePret + '\'' +
                "} " + super.toString();
    }

    // Getters & Setters

    public String gettypePret() {
        return typePret;
    }

    public void settypePret(String typePret) {
        this.typePret = typePret;
    }
}
