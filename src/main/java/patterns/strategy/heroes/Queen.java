package patterns.strategy.heroes;

import patterns.strategy.algorithms.fight.Sword;
import patterns.strategy.algorithms.talk.GreetingSpeech;

public class Queen extends Character {
    public Queen() {
        setName("Queen");
        setWeapon(new Sword());
        setTalk(new GreetingSpeech());
    }
}
