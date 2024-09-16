import org.ahesh.types.Duck;
import org.ahesh.types.DuckTypes.MallardDuck;
import org.ahesh.types.FlyBehaviour.MallardDuckFlyBehaviour;
import org.ahesh.types.FlyBehaviour.RubberDuckFlyBehaviour;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.setFlyBehaviour(new RubberDuckFlyBehaviour());
        mallardDuck.performFly();
    }
}