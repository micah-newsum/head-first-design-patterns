package factory;

import factory.pizzas.Pizza;

/**
 * You want all the franchise pizza stores to leverage your PizzaStore code, so the
 * pizzas are prepared in the same way.
 */
public abstract class PizzaStore {
    public PizzaStore() {

    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }

    abstract Pizza createPizza(String type);
}