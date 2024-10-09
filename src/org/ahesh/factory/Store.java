package org.ahesh.factory;

import org.ahesh.factory.Pizza.Pizza;
import org.ahesh.factory.types.PizzaType;
public abstract class Store {
    public void orderPizza(PizzaType pizzaType) {
        Pizza pizza = createPizza();
    }

    public abstract Pizza createPizza();

}
