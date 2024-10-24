import org.ahesh.decarator.Breverage;
import org.ahesh.decarator.beverages.DarkRoast;
import org.ahesh.decarator.condiments.Milk;
import org.ahesh.decarator.condiments.Mocha;
import org.ahesh.decarator.reader.LowerCaseInputStream;
import org.ahesh.observer.classes.Display.CurrentConditionsDisplay;
import org.ahesh.observer.classes.Display.ForeCastDisplay;
import org.ahesh.observer.classes.Display.HeatIndexDisplay;
import org.ahesh.observer.classes.Display.StatisticsDisplay;
import org.ahesh.observer.classes.WeatherData;
import org.ahesh.observer.types.Observer;
import org.ahesh.observer.types.Subject;
import org.ahesh.threads.Worker1;
import org.ahesh.threads.Worker2;
import org.ahesh.threads.interfaces.Worker;
import org.ahesh.types.Duck;
import org.ahesh.types.DuckTypes.MallardDuck;
import org.ahesh.types.FlyBehaviour.RubberDuckFlyBehaviour;
import org.ahesh.types.QuackBehaviour.MallardDuckQuackBheaviour;

import java.io.*;
import java.time.Instant;

public class Main {

    public static void main(String[] args) {
        Worker1 worker1 = new Worker1();
        Worker2 worker2 = new Worker2();

        worker1.start();
        worker2.start();
        try{
            worker1.join();
            worker2.join();

            System.out.println(worker1.getResult());
            System.out.println(worker2.getResult());
            System.out.println(worker1.getResult().equals(worker2.getResult()));
        }catch (Exception e) {
            e.printStackTrace();
        }



    }
}