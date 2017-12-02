package patterns.decorator.components;

import java.math.BigDecimal;

public abstract class Beverage {
    public abstract String getDescription();
    public abstract BigDecimal getCost();

    public void printInfo() {
        System.out.println("Description:" + getDescription());
        System.out.println("Cost:" + getCost());
    }
}
