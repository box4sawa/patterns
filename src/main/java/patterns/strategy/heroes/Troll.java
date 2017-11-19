package patterns.strategy.heroes;

import patterns.strategy.algorithms.fight.Axe;
import patterns.strategy.algorithms.talk.RudeSpeech;

public class Troll extends Character {
    public Troll() {
        setName("Troll");
        setWeapon(new Axe());
        setTalk(new RudeSpeech());
    }

}
