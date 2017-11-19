package patterns.strategy.heroes;

import patterns.strategy.algorithms.fight.Gun;
import patterns.strategy.algorithms.talk.GreetingSpeech;

public class King extends Character {
    public King() {
        setName("King");
        setWeapon(new Gun());
        setTalk(new GreetingSpeech());
    }
}
