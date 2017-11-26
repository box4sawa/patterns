package patterns.observer.subject;

import patterns.observer.observer.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers(Object arg);
    public void setChanged();
}
