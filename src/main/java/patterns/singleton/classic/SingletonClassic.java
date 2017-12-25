package patterns.singleton.classic;

public class SingletonClassic {
    private static SingletonClassic instance;

    private SingletonClassic(){}

    public static SingletonClassic getInstance() {
        if (instance == null)
            instance = new SingletonClassic();
        return instance;
    }

    public void sayHelo() {
        System.out.println("Hello from classic Singleton");
    }
}
