package patterns.factory.simple_factory.client;

import patterns.factory.simple_factory.factory.PizzaFactory;
import patterns.factory.simple_factory.pizza.Pizza;

public class PizzaStore {
    private PizzaFactory factory;

    public PizzaStore(PizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String pizzaName) {
        Pizza pizza = factory.createPizza(pizzaName);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
