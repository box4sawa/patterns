package patterns.decorator.components;

import java.math.BigDecimal;

public class Espresso extends Beverage {
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal("1.2");
    }
}
