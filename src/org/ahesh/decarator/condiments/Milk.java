package org.ahesh.decarator.condiments;

import org.ahesh.decarator.CondimentDecorator;

public class Milk extends CondimentDecorator {
    @Override
    public double cost() {
        return 0.10;
    }
}
