package org.ahesh.decarator.condiments;

import org.ahesh.decarator.Breverage;
import org.ahesh.decarator.CondimentDecorator;

public class Milk extends CondimentDecorator {
    public Milk(Breverage beverage) {
        this.breverage = beverage;
    }
    @Override
    public double cost() {
        return 0.10 + breverage.cost();
    }
}
