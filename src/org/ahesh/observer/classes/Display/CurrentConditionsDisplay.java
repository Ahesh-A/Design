package org.ahesh.observer.classes.Display;

import org.ahesh.observer.types.Display;
import org.ahesh.observer.types.Observer;
import org.ahesh.observer.types.Subject;

public class CurrentConditionsDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject subject;

    public void update(float temperature, float humidity, float pressure) {
        setTemperature(temperature);
        setHumidity(humidity);
        setPressure(pressure);

        display();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public void display(){
        System.out.println("Current Conditions: ");
        System.out.println("Temperature: " + temperature + "\n" + "Pressure: " + pressure + "Humidity: " + humidity);
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Subject getSubject() {
        return this.subject;
    }
}
