package factory;

import factory.pizzas.NYStyleCheesePizza;
import factory.pizzas.Pizza;

public class NYPizzaFactory extends PizzaStore {
    
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        }

        return pizza;
    }
}
