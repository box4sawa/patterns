package patterns.strategy.algorithms.talk;

public class GreetingSpeech implements TalkBehavior {
    @Override
    public void saySomething() {
        System.out.println("Hi there. How was your journey?");
    }
}
