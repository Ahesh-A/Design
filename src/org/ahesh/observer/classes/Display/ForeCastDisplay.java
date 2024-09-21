package org.ahesh.observer.classes.Display;

import org.ahesh.observer.types.Display;
import org.ahesh.observer.types.Observer;
import org.ahesh.observer.types.Subject;
import org.ahesh.observer.classes.WeatherData;
public class ForeCastDisplay implements Display, Observer{
    private float temperature;
    private float humidity;
    private float pressure;

    private WeatherData weatherData;
    public ForeCastDisplay(WeatherData weatherData) {
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


    public void update() {
        setTemperature(weatherData.getTemperature());
        setHumidity(weatherData.getHumidity());
        setPressure(weatherData.getPressure());

        display();
    }
    public void display() {
        System.out.println("Forecast: ");
        System.out.println("Temperature: " + temperature + "Humidity: " + humidity);
        System.out.println("You might expect a cooler weather.");
    }
}
