package patterns.strategy.algorithms.fight;

public class Axe implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Axe is ready for the battle");
    }
}
