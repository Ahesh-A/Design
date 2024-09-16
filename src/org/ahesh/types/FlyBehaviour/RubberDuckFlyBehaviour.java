package org.ahesh.types.FlyBehaviour;

import org.ahesh.types.DuckInterface.FlyBehaviour;

public class RubberDuckFlyBehaviour implements FlyBehaviour {
    public void fly() {
        System.out.println("I can't fly");
    }
}
