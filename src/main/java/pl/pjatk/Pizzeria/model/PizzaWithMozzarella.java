package pl.pjatk.Pizzeria.model;

import pl.pjatk.Pizzeria.model.Pizza;

import java.math.BigDecimal;

public class PizzaWithMozzarella  extends Pizza {

    private static final BigDecimal MOZZARELLA_PRICE = new BigDecimal(5);
    private final Pizza basePizza;


    public PizzaWithMozzarella(Pizza basePizza){
        this.basePizza = basePizza;
    }

    public BigDecimal getBasePrice(){
        return basePizza.getBasePrice().add(MOZZARELLA_PRICE);
    }
}
