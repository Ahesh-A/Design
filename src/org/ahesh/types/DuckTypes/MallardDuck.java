package org.ahesh.types.DuckTypes;

import org.ahesh.types.Duck;
import org.ahesh.types.FlyBehaviour.MallardDuckFlyBehaviour;

public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Im Mallard duck displaying myself");
    }

}
