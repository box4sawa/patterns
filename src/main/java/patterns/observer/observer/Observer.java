package patterns.observer.observer;

import patterns.observer.subject.Subject;

public interface Observer {
    public void update(Subject subj, Object args);
}
