package org.ahesh.observer.types;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver(Observer o);
}