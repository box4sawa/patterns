package patterns.factory.factory_method;

import patterns.factory.factory_method.factory.ChicagoPizzaStore;
import patterns.factory.factory_method.factory.NewYorkPizzaStore;
import patterns.factory.factory_method.factory.PizzaStore;
import patterns.factory.factory_method.pizza.Pizza;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NewYorkPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza nyPizza = nyPizzaStore.orderPizza("cheese");
        Pizza chicagoPizza = chicagoPizzaStore.orderPizza("cheese");

        System.out.println(nyPizza.name);
        System.out.println(chicagoPizza.name);
    }
}
