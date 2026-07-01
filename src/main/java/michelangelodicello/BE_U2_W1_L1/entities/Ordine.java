package michelangelodicello.BE_U2_W1_L1.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Ordine {
    private static int contatore = 1;

    private int numeroOrdine = contatore++;
    private Tavolo tavolo;
    private String stato = "IN_CORSO"; // IN_CORSO, PRONTO, SERVITO
    private int numeroCoperti;
    private LocalDateTime ora = LocalDateTime.now();
    private List<MenuItem> elementi = new ArrayList<>();
    private double costoCoperto;

    public Ordine(Tavolo tavolo, int numeroCoperti, double costoCoperto) {
        this.tavolo = tavolo;
        this.numeroCoperti = numeroCoperti;
        this.costoCoperto = costoCoperto;
    }

    public void aggiungiElemento(MenuItem item) {
        elementi.add(item);
    }

    public double getImportoTotale() {
        double totaleElementi = elementi.stream().mapToDouble(MenuItem::getPrezzo).sum();
        return totaleElementi + (numeroCoperti * costoCoperto);
    }

    @Override
    public String toString() {
        return "Ordine #" + numeroOrdine + " - " + tavolo + " - Stato: " + stato
                + " - Coperti: " + numeroCoperti + " - Ora: " + ora
                + "\nElementi: " + elementi
                + "\nTotale: € " + getImportoTotale();
    }
}