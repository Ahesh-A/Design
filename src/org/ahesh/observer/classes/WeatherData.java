package org.ahesh.observer.classes;

import org.ahesh.observer.types.Observer;
import org.ahesh.observer.types.Subject;
import java.util.List;
import java.util.ArrayList;

public class WeatherData implements Subject {
    List<Observer> observerList = new ArrayList<>();

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
            observer.update();
        }
    }

    public void measurementsChanged() {

        for (Observer observer : observerList) {
            observer.update();
        }
    }
}
