package michelangelodicello.BE_U2_W1_L1.entities;

import java.util.List;

public class Menu {
    private List<Pizza> pizze;
    private List<Bevanda> bevande;

    public Menu(List<Pizza> pizze, List<Bevanda> bevande) {
        this.pizze = pizze;
        this.bevande = bevande;
    }

    public List<Pizza> getPizze() {
        return pizze;
    }

    public List<Bevanda> getBevande() {
        return bevande;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("=== MENU ===\nPizze:\n");
        pizze.forEach(p -> sb.append("  ").append(p).append("\n"));
        sb.append("Bevande:\n");
        bevande.forEach(b -> sb.append("  ").append(b).append("\n"));
        return sb.toString();
    }
}