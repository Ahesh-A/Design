package org.ahesh.decarator;

public abstract class CondimentDecorator extends Breverage{
    public Breverage breverage;
    public CondimentDecorator(Breverage breverage) {
        this.breverage = breverage;
    }

    public abstract double cost();
}
