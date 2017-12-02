package patterns.decorator.decorators;

import patterns.decorator.components.Beverage;

import java.math.BigDecimal;

public class Milk extends BeverageDecorator {
    public Milk(Beverage b) {
        setBeverage(b);
    }

    @Override
    public String getDescription() {
        return "Milk+" + getBeverage().getDescription();
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal("0.1").add(getBeverage().getCost());
    }
}
