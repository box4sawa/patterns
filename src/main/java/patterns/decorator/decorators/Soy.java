package patterns.decorator.decorators;

import patterns.decorator.components.Beverage;

import java.math.BigDecimal;

public class Soy extends BeverageDecorator {
    public Soy(Beverage b) {
        setBeverage(b);
    }

    @Override
    public String getDescription() {
        return "Soy+" + getBeverage().getDescription();
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal("0.2").add(getBeverage().getCost());
    }
}
