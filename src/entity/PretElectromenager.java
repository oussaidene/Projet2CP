package entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@DiscriminatorValue("pret_electromenager")
public class PretElectromenager extends PretRemboursable {
    @Column(name = "produit")
    // TODO: think about column produit
    private String produit;

    public PretElectromenager(int id, Employe employe, int PV, LocalDate dateDemande, double somme,
                              LocalDate dateDebut, LocalDate dateProchain, double sommeRestante,
                              int nbMois, String produit) {
        super(id, employe, PV, dateDemande, somme, dateDebut, dateProchain, sommeRestante,
                nbMois);
        this.produit = produit;
    }

    // Overrided methods

    @Override
    public String toString() {
        return "PretElectromenager{" +
                "produit='" + produit + '\'' +
                "} " + super.toString();
    }

    // Getters & Setters

    public String getProduit() {
        return produit;
    }

    public void setProduit(String produit) {
        this.produit = produit;
    }
}
