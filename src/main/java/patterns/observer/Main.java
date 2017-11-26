package patterns.observer;

import patterns.observer.observer.CurrentConditionDisplay;
import patterns.observer.subject.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(23, 50, 72);
        weatherData.setMeasurements(24, 55, 72);

        weatherData.removeObserver(conditionDisplay);
        weatherData.setMeasurements(100, 100, 100);
    }
}
