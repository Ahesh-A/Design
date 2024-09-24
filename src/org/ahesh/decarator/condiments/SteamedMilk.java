package org.ahesh.decarator.condiments;

import org.ahesh.decarator.Breverage;
import org.ahesh.decarator.CondimentDecorator;

public class SteamedMilk extends CondimentDecorator {
    public SteamedMilk(Breverage breverage) {
        super(breverage);
    }
    @Override
    public double cost() {
        return 0.10;
    }
}
