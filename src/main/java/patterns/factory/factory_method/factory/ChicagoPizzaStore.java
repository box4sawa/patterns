package patterns.factory.factory_method.factory;

import patterns.factory.factory_method.pizza.Pizza;
import patterns.factory.factory_method.pizza.chicago.ChicagoCheesePizza;
import patterns.factory.factory_method.pizza.chicago.ChicagoClamPizza;
import patterns.factory.factory_method.pizza.chicago.ChicagoPepperoniPizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese"))
            return new ChicagoCheesePizza();
        if (type.equals("clam"))
            return new ChicagoClamPizza();
        if (type.equals("pepperoni"))
            return new ChicagoPepperoniPizza();
        throw new IllegalArgumentException("Wrong pizza type:" + type);
    }
}
