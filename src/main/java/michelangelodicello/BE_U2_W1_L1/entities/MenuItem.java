package michelangelodicello.BE_U2_W1_L1.entities;

public abstract class MenuItem {
    protected String nome;
    protected double prezzo;
    protected String infoNutrizionali;

    public MenuItem(String nome, double prezzo, String infoNutrizionali) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.infoNutrizionali = infoNutrizionali;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String getInfoNutrizionali() {
        return infoNutrizionali;
    }

    @Override
    public String toString() {
        return nome + " - € " + prezzo + " [" + infoNutrizionali + "]";
    }
}