package patterns.strategy.algorithms.fight;

public class Gun implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Gun is ready for the battle");
    }
}
