package org.ahesh.factory.Stores.types;

import org.ahesh.factory.Pizza.types.CheesePizza;
import org.ahesh.factory.Pizza.types.ClamPizza;
import org.ahesh.factory.Pizza.types.PepperopniPizza;
import org.ahesh.factory.Pizza.types.VeggiePizza;
import org.ahesh.factory.Stores.Store;
import org.ahesh.factory.Pizza.Pizza;
import org.ahesh.factory.ingerdientfactory.types.NyIngredientFactory;
import org.ahesh.factory.types.PizzaType;
public class NyPizzaStore extends Store{
    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        return switch (pizzaType) {
            case CHEESE -> new CheesePizza(new NyIngredientFactory());
            case CLAM -> new ClamPizza(new NyIngredientFactory());
            case PEPPERONI -> new PepperopniPizza(new NyIngredientFactory());
            case VEGGIE -> new VeggiePizza(new NyIngredientFactory());
        };
    }
}
