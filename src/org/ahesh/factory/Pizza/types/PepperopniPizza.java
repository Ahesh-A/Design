package org.ahesh.factory.Pizza.types;

import  org.ahesh.factory.Pizza.Pizza;
import org.ahesh.factory.ingerdientfactory.PizzaIngredientFactory;

public class PepperopniPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public PepperopniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
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
