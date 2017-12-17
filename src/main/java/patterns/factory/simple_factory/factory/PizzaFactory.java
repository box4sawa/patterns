package patterns.factory.simple_factory.factory;

import patterns.factory.simple_factory.pizza.CheesePizza;
import patterns.factory.simple_factory.pizza.ClamPizza;
import patterns.factory.simple_factory.pizza.PepperoniPizza;
import patterns.factory.simple_factory.pizza.Pizza;

public class PizzaFactory {
    public Pizza createPizza(String type) {
        if (type.equals("CheesePizza"))
            return new CheesePizza();
        if (type.equals("PepperoniPizza"))
            return new PepperoniPizza();
        if (type.equals("ClamPizza"))
            return new ClamPizza();
        throw new IllegalArgumentException("There is no such pizza type like: " + type);
    }
}
