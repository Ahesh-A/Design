package org.ahesh.decarator;

public abstract class Breverage {
    String description = "This is a beverage";
    public String getDescription() {
        return this.description;
    }

    public abstract double cost();
}
