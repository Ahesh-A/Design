package org.ahesh.decarator.condiments;

import org.ahesh.decarator.Breverage;
import org.ahesh.decarator.CondimentDecorator;

public class SteamedMilk extends CondimentDecorator {
    public SteamedMilk(Breverage beverage) {
        this.breverage = beverage;
    }
    @Override
    public double cost() {
        return 0.10 + breverage.cost();
    }
    @Override
    public String getDescription() {
        return "SteamedMilk";
    }
}
