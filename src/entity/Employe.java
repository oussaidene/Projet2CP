package entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "employe")
public class Employe {
    @Id
    // TODO: think about Employe's id generation type
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sec_social")
    // Numéro de sécurité social (id de l'employé)
    // TODO: n° séc. social == id Employe ?
    private int secSocial;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "date_naissance")
    private LocalDate dateNaissance;

    @Column(name = "service")
    // Service occupé par l'employé
    // TODO: énumération service Employe
    private String service;

    @Column(name = "salaire")
    // Salaire de base de l'employé
    private double salaire;

    public Employe(int secSocial, String nom, String prenom, LocalDate dateNaissance, String service, double salaire) {
        this.secSocial = secSocial;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.service = service;
        this.salaire = salaire;
    }

    // Overrided methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return getSecSocial() == employe.getSecSocial();
    }

    @Override
    public String toString() {
        return "Employe{" +
                "secSocial=" + secSocial +
                ", nom='" + nom + '\'' +
                ", prénom='" + prenom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", service='" + service + '\'' +
                ", salaire=" + salaire +
                '}';
    }

    // Getters & Setters

    public int getSecSocial() {
        return secSocial;
    }

    public void setSecSocial(int secSocial) {
        this.secSocial = secSocial;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrénom() {
        return prenom;
    }

    public void setPrénom(String prénom) {
        this.prenom = prénom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
}
