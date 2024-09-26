package org.ahesh.decarator;

public abstract class CondimentDecorator extends Breverage{
    public Breverage breverage;
    public abstract double cost();
    public abstract String getDescription();
}
