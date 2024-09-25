package org.ahesh.decarator;

public abstract class Breverage {
    public enum Size {
        TALL,
        GRANDE,
        VENTI
    }
    Size size = Size.TALL;
    public String description = "This is a beverage";
    public String getDescription() {
        return this.description;
    }
    public abstract double cost();
}
