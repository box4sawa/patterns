package patterns.observer.observer;

import patterns.observer.subject.Subject;
import patterns.observer.subject.WeatherData;

import java.util.List;

public class CurrentConditionDisplay implements Observer {
    private Subject subject;
    private int temperature;
    private int humidity;
    private int pressure;

    public CurrentConditionDisplay(Subject s) {
        subject = s;
        subject.registerObserver(this);
    }

    @Override
    public void update(Subject subj, Object args) {
        if (subj instanceof WeatherData) {
            List<Integer> data = (List<Integer>) args;
            temperature = data.get(0);
            humidity = data.get(1);
            pressure = data.get(2);
            display();
        }
    }

    public void display() {
        System.out.println("CurrentConditionDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}');
    }

}
