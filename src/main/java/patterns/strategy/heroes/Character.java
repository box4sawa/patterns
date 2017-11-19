package patterns.strategy.heroes;

import patterns.strategy.algorithms.fight.WeaponBehavior;
import patterns.strategy.algorithms.talk.TalkBehavior;

public abstract class Character {
    private WeaponBehavior weapon;
    private TalkBehavior talk;
    private String name;

    public void fight() {
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void talk() {
        System.out.println("I'm " + name);
        talk.saySomething();
    }

    public void setTalk(TalkBehavior talk) {
        this.talk = talk;
    }

    public void setName(String name) {
        this.name = name;
    }
}
