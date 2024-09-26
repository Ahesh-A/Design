package org.ahesh.decarator.condiments;
import org.ahesh.decarator.Breverage;
import org.ahesh.decarator.CondimentDecorator;

public class Mocha extends CondimentDecorator{
    public  Mocha(Breverage breverage) {
        this.breverage = breverage;
    }
    @Override
    public double cost() {
        return 0.15 + breverage.cost();
    }
    @Override
    public String getDescription() {
        return "Mocha";
    }
}
