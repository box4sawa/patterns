package patterns.factory.factory_method.factory;

import patterns.factory.factory_method.pizza.Pizza;
import patterns.factory.factory_method.pizza.ny.NewYorkCheesePizza;
import patterns.factory.factory_method.pizza.ny.NewYorkClamPizza;
import patterns.factory.factory_method.pizza.ny.NewYorkPepperoniPizza;

public class NewYorkPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese"))
            return new NewYorkCheesePizza();
        if (type.equals("clam"))
            return new NewYorkClamPizza();
        if (type.equals("pepperoni"))
            return new NewYorkPepperoniPizza();
        throw new IllegalArgumentException("Wrong pizza type:" + type);
    }
}
