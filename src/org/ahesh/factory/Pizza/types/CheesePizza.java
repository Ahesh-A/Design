package org.ahesh.factory.Pizza.types;

import org.ahesh.factory.Pizza.Pizza;
import org.ahesh.factory.ingerdientfactory.PizzaIngredientFactory;

public class CheesePizza extends Pizza{
    PizzaIngredientFactory pizzaIngredientFactory;
    public CheesePizza (PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }
    public void prepare() {
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        veggies = pizzaIngredientFactory.createVeggies();
        clams = pizzaIngredientFactory.createClams();
        pepperoni = pizzaIngredientFactory.createPepperoni();
    }
}
