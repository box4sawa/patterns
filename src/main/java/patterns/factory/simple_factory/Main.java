package patterns.factory.simple_factory;

import patterns.factory.simple_factory.client.PizzaStore;
import patterns.factory.simple_factory.factory.PizzaFactory;
import patterns.factory.simple_factory.pizza.Pizza;

public class Main {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore(new PizzaFactory());
        Pizza pizza = store.orderPizza("ClamPizza");
        System.out.println(pizza.name);
    }
}
