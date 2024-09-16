import org.ahesh.types.Duck;
import org.ahesh.types.DuckTypes.MallardDuck;
import org.ahesh.types.FlyBehaviour.RubberDuckFlyBehaviour;
import org.ahesh.types.QuackBehaviour.MallardDuckQuackBheaviour;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.setFlyBehaviour(new RubberDuckFlyBehaviour());
        mallardDuck.setQuackBehaviour(new MallardDuckQuackBheaviour());

        mallardDuck.performFly();
        mallardDuck.performQuack();
    }
}