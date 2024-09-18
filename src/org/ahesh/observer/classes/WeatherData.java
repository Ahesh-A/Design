package org.ahesh.observer.classes;

import org.ahesh.observer.types.Observer;
import org.ahesh.observer.types.Subject;
import java.util.List;
import java.util.ArrayList;

public class WeatherData implements Subject {
    private float temperature;
    private float humidity;
    private float pressure;
    private final List<Observer> observerList;
    public WeatherData() {
        observerList = new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer observer) {
        if(observer != null) {
            observerList.add(observer);
        }
    }
    @Override
    public void removeObserver(Observer observer) {
        if(observer != null && !observerList.isEmpty()) {
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObserver(Observer observer) {
        if(observer != null) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {

        for (Observer observer : observerList) {
            notifyObserver(observer);
        }
    }
}
