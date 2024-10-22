package org.ahesh.factory.ingerdientfactory;

import org.ahesh.factory.ingredients.Dough;
import org.ahesh.factory.ingredients.Sauce;
import org.ahesh.factory.ingredients.Cheese;
import org.ahesh.factory.ingredients.Veggie;
import org.ahesh.factory.ingredients.Pepperoni;
import org.ahesh.factory.ingredients.Clam;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggie[] createVeggies();
    Pepperoni createPepperoni();
    Clam createClams();

}
