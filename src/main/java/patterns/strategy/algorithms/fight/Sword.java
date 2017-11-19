package patterns.strategy.algorithms.fight;

public class Sword implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Sword is ready for the battle");
    }
}
