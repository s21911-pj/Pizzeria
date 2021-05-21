package pl.pjatk.Pizzeria.model;

import java.math.BigDecimal;

public class Pizza {

    private static final BigDecimal BASE_PRICE = new BigDecimal(10);

    public BigDecimal getBasePrice() {
        return BASE_PRICE;
    }


}
