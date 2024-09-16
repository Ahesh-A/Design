package org.ahesh.types;
import org.ahesh.types.DuckInterface.FlyBehaviour;

public class Duck {

    FlyBehaviour flyBehaviour;
    public Duck(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }
    public void swim() {
        System.out.println("Im Generic duck swimming, quack quack...");
    }

    public void display() {
        System.out.println("Im generic duck, displaying myself");
    }

    public void performFly() {
        if(flyBehaviour != null) {
            flyBehaviour.fly();
        }
    }
    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }
}
