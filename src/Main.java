import org.ahesh.decarator.Breverage;
import org.ahesh.decarator.beverages.DarkRoast;
import org.ahesh.decarator.condiments.Milk;
import org.ahesh.decarator.condiments.Mocha;
import org.ahesh.observer.classes.Display.CurrentConditionsDisplay;
import org.ahesh.observer.classes.Display.ForeCastDisplay;
import org.ahesh.observer.classes.Display.HeatIndexDisplay;
import org.ahesh.observer.classes.Display.StatisticsDisplay;
import org.ahesh.observer.classes.WeatherData;
import org.ahesh.observer.types.Observer;
import org.ahesh.observer.types.Subject;
import org.ahesh.types.Duck;
import org.ahesh.types.DuckTypes.MallardDuck;
import org.ahesh.types.FlyBehaviour.RubberDuckFlyBehaviour;
import org.ahesh.types.QuackBehaviour.MallardDuckQuackBheaviour;

public class Main {
    public static void main(String[] args) {
//        Duck mallardDuck = new MallardDuck();
//        mallardDuck.setFlyBehaviour(new RubberDuckFlyBehaviour());
//        mallardDuck.setQuackBehaviour(new MallardDuckQuackBheaviour());
//
//        mallardDuck.performFly();
//        mallardDuck.performQuack();
//        WeatherData weatherData = new WeatherData();
//        Observer currentConditionDisplay = new CurrentConditionsDisplay(weatherData);
//        Observer foreCastDisplay = new ForeCastDisplay(weatherData);
//        Observer statisticsDisplay = new StatisticsDisplay(weatherData);
//        Observer heatIndexObserver = new HeatIndexDisplay(weatherData);
//
//        weatherData.registerObserver(currentConditionDisplay);
//        weatherData.registerObserver(foreCastDisplay);
//        weatherData.registerObserver(statisticsDisplay);
//        weatherData.registerObserver(heatIndexObserver);
//
//        weatherData.setMeasurements(10, 23, 34);
//
//        weatherData.removeObserver(currentConditionDisplay);
//
//        weatherData.setMeasurements(10, 23, 34);
        Breverage breverage = new DarkRoast();

        breverage = new Milk(breverage);
        breverage = new Mocha(breverage);
        breverage = new Mocha(breverage);

        System.out.println(breverage.getDescription());
        System.out.println(breverage.cost());
    }
}