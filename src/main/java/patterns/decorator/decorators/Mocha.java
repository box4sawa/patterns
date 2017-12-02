package patterns.decorator.decorators;

import patterns.decorator.components.Beverage;

import java.math.BigDecimal;

public class Mocha extends BeverageDecorator {
    public Mocha(Beverage b) {
        setBeverage(b);
    }

    @Override
    public String getDescription() {
        return "Mocha+" + getBeverage().getDescription();
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal("0.3").add(getBeverage().getCost());
    }
}
