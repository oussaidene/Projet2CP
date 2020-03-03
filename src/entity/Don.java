package entity;

import java.time.LocalDate;

public class Don extends Pret {
    // TODO: énumération motif Don
    private String motif;

    public Don(int id, Employe employe, int PV, LocalDate datePrêt, double somme, String motif) {
        super(id, employe, PV, datePrêt, somme);
        this.motif = motif;
    }

    // Overrided methods

    @Override
    public String toString() {
        return "Don{" +
                "motif='" + motif + '\'' +
                "} " + super.toString();
    }

    // Getters & Setters

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }
}
