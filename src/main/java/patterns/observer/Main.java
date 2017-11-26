package patterns.observer;

import patterns.observer.observer.CurrentConditionDisplay;
import patterns.observer.subject.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData publisher = new WeatherData();
        CurrentConditionDisplay subscriber = new CurrentConditionDisplay(publisher);

        publisher.setMeasurements(23, 50, 72);
        publisher.setMeasurements(24, 55, 72);

        publisher.removeObserver(subscriber);
        publisher.setMeasurements(100, 100, 100);
    }
}
