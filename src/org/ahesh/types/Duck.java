package org.ahesh.types;
import org.ahesh.types.DuckInterface.FlyBehaviour;
import org.ahesh.types.DuckInterface.QuackBehaviour;

public class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
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
    public void performQuack() {
        if(quackBehaviour != null) {
            quackBehaviour.quack();
        }
    }
    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }
    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

}
