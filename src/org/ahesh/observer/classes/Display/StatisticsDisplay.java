package org.ahesh.observer.classes.Display;

import org.ahesh.observer.classes.WeatherData;
import org.ahesh.observer.types.Display;
import org.ahesh.observer.types.Observer;
import org.ahesh.observer.types.Subject;

public class StatisticsDisplay implements Display, Observer {
    private float temperature;
    private float humidity;
    private float pressure;
    WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
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

    public void display() {
        System.out.println("Statistics: ");
        System.out.println("Temperature + Humidity + Pressure = " + temperature + humidity + pressure);
    }
    public void update() {

        setTemperature(weatherData.getTemperature());
        setHumidity(weatherData.getHumidity());
        setPressure(weatherData.getPressure());

        display();
    }
}
