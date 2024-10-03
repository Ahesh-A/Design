package org.ahesh.decarator.condiments;

import org.ahesh.decarator.Breverage;
import org.ahesh.decarator.CondimentDecorator;

public class Soy extends CondimentDecorator {
    public Soy(Breverage breverage) {
        this.breverage = breverage;
    }
    @Override
    public double cost() {
        double cost = 0.15 + breverage.cost();
        Size size = breverage.getSize();
        if(size == Size.VENTI) {
            cost += 0.1;
        }

        if(size == Size.GRANDE) {
            cost += 0.15;
        }

        if(size == Size.TALL) {
            cost += 0.2;
        }

        return cost;
//        return 0.15 + breverage.cost();
    }
    @Override
    public String getDescription() {
        return "Soy";
    }
}
