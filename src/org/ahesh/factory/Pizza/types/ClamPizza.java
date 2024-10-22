package org.ahesh.factory.Pizza.types;

import org.ahesh.factory.Pizza.Pizza;
import org.ahesh.factory.ingerdientfactory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;
    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        veggies = pizzaIngredientFactory.createVeggies();
        clams = pizzaIngredientFactory.createClams();
        pepperoni = pizzaIngredientFactory.createPepperoni();
    }
}
