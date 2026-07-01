package michelangelodicello.BE_U2_W1_L1;

import michelangelodicello.BE_U2_W1_L1.entities.Menu;
import michelangelodicello.BE_U2_W1_L1.entities.Ordine;
import michelangelodicello.BE_U2_W1_L1.entities.Tavolo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeU2W1L1Application implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(BeU2W1L1Application.class);

    @Autowired
    private Menu menu;

    @Value("${ristorante.costo-coperto}")
    private double costoCoperto;

    public static void main(String[] args) {
        SpringApplication.run(BeU2W1L1Application.class, args);
    }

    @Override
    public void run(String... args) {
        logger.info("{}", menu);

        Tavolo tavolo3 = new Tavolo(3, 4, "OCCUPATO");
        Ordine ordine = new Ordine(tavolo3, 2, costoCoperto);
        ordine.aggiungiElemento(menu.getPizze().get(1));
        ordine.aggiungiElemento(menu.getBevande().get(0));

        logger.info("\n{}", ordine);
    }
}