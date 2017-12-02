package patterns.decorator.components;

import java.math.BigDecimal;

public class HouseBlend extends Beverage {
    @Override
    public String getDescription() {
        return "HouseBlend";
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal("1");
    }
}
