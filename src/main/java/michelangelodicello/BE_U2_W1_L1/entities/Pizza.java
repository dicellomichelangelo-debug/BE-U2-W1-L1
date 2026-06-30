package michelangelodicello.BE_U2_W1_L1.entities;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends MenuItem {

    private List<Topping> toppings = new ArrayList<>();

    public Pizza(String nome, double prezzoBase, String infoNutrizionali) {
        super(nome, prezzoBase, infoNutrizionali);
    }

    public void aggiungiTopping(Topping topping) {
        toppings.add(topping);
        prezzo += topping.getPrezzo();
    }

    public List<Topping> getToppings() {
        return toppings;
    }
}