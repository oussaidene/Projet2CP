package entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "pret")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Type de Pret", discriminatorType = DiscriminatorType.STRING)
public abstract class Pret {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    // TODO: annotations champs Employe dans Pret
    private Employe employe;

    @Column(name = "numero_pv")
    // Numéro du PV
    private int PV;

    @Column(name = "date_pret")
    // Date de demande du prêt
    private LocalDate dateDemande;

    @Column(name = "somme")
    // Somme prêtée (Pret Remboursable) / Somme donnée (Don)
    private double somme;

    public Pret(int id, Employe employe, int PV, LocalDate dateDemande, double somme) {
        this.id = id;
        this.employe = employe;
        this.PV = PV;
        this.dateDemande = dateDemande;
        this.somme = somme;
    }

    // Overrided methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pret)) return false;
        Pret pret = (Pret) o;
        return getId() == pret.getId();
    }

    @Override
    public String toString() {
        return "Pret{" +
                "id=" + id +
                ", employé=" + employe +
                ", PV=" + PV +
                ", datePrêt=" + dateDemande +
                ", somme=" + somme +
                '}';
    }

    // Getters & Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employe getEmployé() {
        return employe;
    }

    public void setEmployé(Employe employe) {
        this.employe = employe;
    }

    public int getPV() {
        return PV;
    }

    public void setPV(int PV) {
        this.PV = PV;
    }

    public LocalDate getDatePrêt() {
        return dateDemande;
    }

    public void setDatePrêt(LocalDate datePrêt) {
        this.dateDemande = datePrêt;
    }

    public double getSomme() {
        return somme;
    }

    public void setSomme(double somme) {
        this.somme = somme;
    }
}
