package org.ahesh.observer.types;

public interface Subject {
    void registerObserver();
    void removeObserver();
    void notifyObserver();
}