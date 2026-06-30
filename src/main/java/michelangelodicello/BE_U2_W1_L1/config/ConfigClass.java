package michelangelodicello.BE_U2_W1_L1.config;

import michelangelodicello.BE_U2_W1_L1.entities.Bevanda;
import michelangelodicello.BE_U2_W1_L1.entities.Menu;
import michelangelodicello.BE_U2_W1_L1.entities.Pizza;
import michelangelodicello.BE_U2_W1_L1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ConfigClass {

    @Bean
    public List<Pizza> pizzeMenu() {
        Pizza margherita = new Pizza("Margherita", 5.0, "Calorie: 800");

        Pizza hawaiian = new Pizza("Hawaiian Pizza", 5.0, "Calorie: 950");
        hawaiian.aggiungiTopping(new Topping("Prosciutto", 1.5));
        hawaiian.aggiungiTopping(new Topping("Ananas", 1.0));

        Pizza doppioProsciutto = new Pizza("Margherita doppio prosciutto", 5.0, "Calorie: 1000");
        doppioProsciutto.aggiungiTopping(new Topping("Prosciutto", 1.5));
        doppioProsciutto.aggiungiTopping(new Topping("Prosciutto", 1.5));

        return List.of(margherita, hawaiian, doppioProsciutto);
    }

    @Bean
    public List<Bevanda> bevandeMenu() {
        return List.of(
                new Bevanda("Acqua naturale", 1.5, "0 kcal"),
                new Bevanda("Coca Cola", 3.0, "140 kcal")
        );
    }

    @Bean
    public Menu menu(List<Pizza> pizzeMenu, List<Bevanda> bevandeMenu) {
        return new Menu(pizzeMenu, bevandeMenu);
    }
}