package org.ahesh.factory.Pizza;

public abstract class Pizza {
    public void prepare() {
        System.out.println("perparing pizza");
    }

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
