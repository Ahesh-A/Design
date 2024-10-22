package org.ahesh.factory.ingerdientfactory.types;

import org.ahesh.factory.IngredientFactory;
import org.ahesh.factory.ingerdientfactory.PizzaIngredientFactory;
import org.ahesh.factory.ingredients.*;
import org.ahesh.factory.ingredients.cheeseTypes.Reggiano;
import org.ahesh.factory.ingredients.clamTypes.FreshClams;
import org.ahesh.factory.ingredients.doughTypes.ThinCrustDough;
import org.ahesh.factory.ingredients.sauceTypes.MarianaSauce;

public class NyIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarianaSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Reggiano();
    }

    @Override
    public Veggie[] createVeggies() {
        return new Veggie[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }

    @Override
    public Clam createClams() {
        return new FreshClams();
    }
}
