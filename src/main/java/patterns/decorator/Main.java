package patterns.decorator;

import patterns.decorator.components.Beverage;
import patterns.decorator.components.Espresso;
import patterns.decorator.components.HouseBlend;
import patterns.decorator.decorators.Milk;
import patterns.decorator.decorators.Mocha;

public class Main {
    public static void main(String[] args) {
        Beverage simple = new Espresso();
        simple.printInfo();

        Beverage complex = new Mocha(new Milk(new HouseBlend()));
        complex.printInfo();
    }
}
