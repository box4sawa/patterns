package patterns.singleton.synchro;

public class SingletonSynchro {
    private static SingletonSynchro instance = new SingletonSynchro();

    private SingletonSynchro(){}

    public static SingletonSynchro getInstance() {
        return instance;
    }

    public void sayHelo() {
        System.out.println("Hello from synchronized Singleton");
    }
}
