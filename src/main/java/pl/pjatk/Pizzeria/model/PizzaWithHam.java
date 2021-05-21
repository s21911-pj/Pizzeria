package pl.pjatk.Pizzeria.model;

import java.math.BigDecimal;

public class PizzaWithHam extends Pizza{
    private static final BigDecimal HAM_PRICE = new BigDecimal(3);
    private final Pizza basePizza;


    public PizzaWithHam(Pizza basePizza){
        this.basePizza = basePizza;
    }

    public BigDecimal getBasePrice(){
        return basePizza.getBasePrice().add(HAM_PRICE);
    }
}
