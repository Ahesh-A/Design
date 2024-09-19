package org.ahesh.observer.classes.Display;

import org.ahesh.observer.types.Display;
import org.ahesh.observer.types.Observer;
import org.ahesh.observer.types.Subject;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class HeatIndexDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private float pressure;

    Subject subject;

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
        final String RESULT_FORMAT = "#.#";

        double Hindex;
        float F = temperature;
        float rh = humidity;

        Hindex = -42.379 + 2.04901523 * F + 10.14333127 * rh;
        Hindex = Hindex - 0.22475541 * F * rh - 6.83783 * Math.pow(10, -3) * F * F;
        Hindex = Hindex - 5.481717 * Math.pow(10, -2) * rh * rh;
        Hindex = Hindex + 1.22874 * Math.pow(10, -3) * F * F * rh;
        Hindex = Hindex + 8.5282 * Math.pow(10, -4) * F * rh * rh;
        Hindex = Hindex - 1.99 * Math.pow(10, -6) * F * F * rh * rh;

        DecimalFormat df = new DecimalFormat(RESULT_FORMAT);
        df.setRoundingMode(RoundingMode.HALF_UP);
        System.out.println("Relative Humidity: ");
        System.out.println(Double.parseDouble(df.format(Hindex)));
    }
}
