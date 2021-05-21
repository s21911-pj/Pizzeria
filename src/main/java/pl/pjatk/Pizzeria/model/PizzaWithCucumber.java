package pl.pjatk.Pizzeria.model;

import java.math.BigDecimal;

public class PizzaWithCucumber extends Pizza{
    private static final BigDecimal CUCUMBER_PRICE = new BigDecimal(1);
    private final Pizza basePizza;

    public PizzaWithCucumber(Pizza basePizza){
        this.basePizza = basePizza;
    }

    public BigDecimal getBasePrice(){
        return basePizza.getBasePrice().add(CUCUMBER_PRICE);
    }
}
