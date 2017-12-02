package patterns.decorator.decorators;

import patterns.decorator.components.Beverage;

public abstract class BeverageDecorator extends Beverage {
    private Beverage beverage;

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }
}
