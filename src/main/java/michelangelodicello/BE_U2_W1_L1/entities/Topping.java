package michelangelodicello.BE_U2_W1_L1.entities;

public class Topping {
    private String nome;
    private double prezzo;

    public Topping(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }
}