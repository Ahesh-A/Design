package org.ahesh.factory.Pizza;

import org.ahesh.factory.ingredients.Cheese;
import org.ahesh.factory.ingredients.Clam;
import org.ahesh.factory.ingredients.Dough;
import org.ahesh.factory.ingredients.Pepperoni;
import org.ahesh.factory.ingredients.Sauce;
import org.ahesh.factory.ingredients.Veggie;
public abstract class Pizza {
    public Dough dough;
    public Sauce sauce;
    public Cheese cheese;
    public Veggie[] veggies;
    public Clam clams;
    public Pepperoni pepperoni;

    public abstract void prepare();

    public void bake() {
        System.out.println("baking pizza");
    }

    public void cut() {
        System.out.println("cutting pizza");
    }

    public void pack() {
        System.out.println("packing pizza");
    }
}
