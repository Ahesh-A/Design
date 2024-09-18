package org.ahesh.observer.types;

public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
