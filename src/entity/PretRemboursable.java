package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public abstract class PretRemboursable extends Pret {
    @Column(name = "date_debut")
    // Date de début de prélèvement
    private LocalDate dateDebut;

    @Column(name = "date_prochain")
    // Date du prochain prélèvement
    private LocalDate dateProchain;

    @Column(name = "somme_restante")
    // Somme restante à prélever
    private double sommeRestante;

    @Column(name = "nb_mois")
    // Nombre de mois restants pour le prélèvements
    // TODO: changer nombre de mois par défaut 10 (Constante globale?)
    private int nbMois = 10;

    public PretRemboursable(int id, Employe employe, int PV, LocalDate dateDemande, double somme,
                            LocalDate dateDebut, LocalDate dateProchain,
                            double sommeRestante, int nbMois) {
        super(id, employe, PV, dateDemande, somme);
        this.dateDebut = dateDebut;
        this.dateProchain = dateProchain;
        this.sommeRestante = sommeRestante;
        this.nbMois = nbMois;
    }

    @Override
    public String toString() {
        return "PretRemboursable{" +
                "dateDebut=" + dateDebut +
                ", dateProchain=" + dateProchain +
                ", sommeRestante=" + sommeRestante +
                ", nbMois=" + nbMois +
                "} " + super.toString();
    }

    // Getters & Setters

    public LocalDate getdateDebut() {
        return dateDebut;
    }

    public void setdateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getdateProchain() {
        return dateProchain;
    }

    public void setdateProchain(LocalDate dateProchain) {
        this.dateProchain = dateProchain;
    }

    public double getSommeRestante() {
        return sommeRestante;
    }

    public void setSommeRestante(double sommeRestante) {
        this.sommeRestante = sommeRestante;
    }

    public int getnbMois() {
        return nbMois;
    }

    public void setnbMois(int nbMois) {
        this.nbMois = nbMois;
    }
}
