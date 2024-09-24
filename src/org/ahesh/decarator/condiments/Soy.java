package org.ahesh.decarator.condiments;

import org.ahesh.decarator.Breverage;
import org.ahesh.decarator.CondimentDecorator;

public class Soy extends CondimentDecorator {
    public Soy(Breverage breverage) {
        super(breverage);
    }
    @Override
    public double cost() {
        return 0.15;
    }
}
