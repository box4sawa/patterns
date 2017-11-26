package patterns.observer.subject;

import patterns.observer.observer.Observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private boolean changed;
    private int temperature;
    private int humidity;
    private int pressure;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(Object arg) {
        if(changed) {
            observers.forEach(observer -> observer.update(this, arg));
            changed = false;
        }
    }

    @Override
    public void setChanged() {
        changed = true;
    }

    public void setMeasurements(int temp, int hum, int press) {
        temperature = temp;
        humidity = hum;
        pressure = press;
        setChanged();
        notifyObservers(Arrays.asList(temperature, humidity, pressure));
    }
}
