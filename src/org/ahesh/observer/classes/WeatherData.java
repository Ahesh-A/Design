package org.ahesh.observer.classes;

import org.ahesh.observer.types.Observer;
import org.ahesh.observer.types.Subject;
import java.util.List;
import java.util.ArrayList;
public class WeatherData implements Subject {
    List<Observer> observerList = new ArrayList<>();

    @Override
    public void registerObserver() {

    }
    @Override
    public void removeObserver() {

    }

    @Override
    public void notifyObserver() {

    }

    public void measurementsChanged() {

    }
}
