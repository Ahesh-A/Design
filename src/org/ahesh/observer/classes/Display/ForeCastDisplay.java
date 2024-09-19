package org.ahesh.observer.classes.Display;

import org.ahesh.observer.types.Display;
import org.ahesh.observer.types.Observer;
import org.ahesh.observer.types.Subject;

public class ForeCastDisplay implements Display, Observer{
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject subject;


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

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void update(float temperature, float humidity, float pressure) {
        setTemperature(temperature);
        setHumidity(humidity);
        setPressure(pressure);

        display();
    }
    public void display() {
        System.out.println("Forecast: ");
        System.out.println("Temperature: " + temperature + "Humidity: " + humidity);
        System.out.println("You might expect a cooler weather.");
    }
}
