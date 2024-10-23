package org.ahesh.factory.Stores;

import org.ahesh.factory.Pizza.Pizza;
import org.ahesh.factory.types.PizzaType;
public abstract class Store {
    public void orderPizza(PizzaType pizzaType) {
        Pizza pizza = createPizza(pizzaType);
    }

    public abstract Pizza createPizza(PizzaType pizzaType);

}
