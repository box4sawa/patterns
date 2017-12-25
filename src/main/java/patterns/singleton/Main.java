package patterns.singleton;

import patterns.singleton.classic.SingletonClassic;
import patterns.singleton.synchro.SingletonSynchro;

public class Main {
    public static void main(String[] args) {
        SingletonClassic.getInstance().sayHelo();
        SingletonSynchro.getInstance().sayHelo();
    }
}
