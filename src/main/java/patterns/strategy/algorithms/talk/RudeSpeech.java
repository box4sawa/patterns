package patterns.strategy.algorithms.talk;

public class RudeSpeech implements TalkBehavior {
    @Override
    public void saySomething() {
        System.out.println("Are you ready for your funeral?");
    }
}
