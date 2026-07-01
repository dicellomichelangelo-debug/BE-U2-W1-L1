package michelangelodicello.BE_U2_W1_L1.entities;

public class Tavolo {
    private int numero;
    private int copertiMassimi;
    private String stato; // "OCCUPATO" o "LIBERO"

    public Tavolo(int numero, int copertiMassimi, String stato) {
        this.numero = numero;
        this.copertiMassimi = copertiMassimi;
        this.stato = stato;
    }

    public int getNumero() {
        return numero;
    }

    public String getStato() {
        return stato;
    }

    @Override
    public String toString() {
        return "Tavolo " + numero + " (" + stato + ")";
    }
}