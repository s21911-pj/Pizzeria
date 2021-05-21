package pl.pjatk.Pizzeria.model;

import java.text.DecimalFormat;
import java.util.List;

public class Restaurant {
    public static void main(String[] args){
        Pizza margherita = new Pizza();
        Pizza withMozzarella = new PizzaWithMozzarella(margherita);
        Pizza withMozzarellaAndHam = new PizzaWithHam(withMozzarella);
        Pizza withMozzarellaHamAndCucumber = new PizzaWithCucumber(withMozzarellaAndHam);

        DecimalFormat df = new DecimalFormat("#,00 zł");
        for (Pizza pizza : List.of(margherita,withMozzarella,withMozzarellaAndHam,withMozzarellaHamAndCucumber)) {
            System.out.println(String.format("%s costs %s.",pizza, df.format(pizza.getBasePrice())));
        }
    }
}
