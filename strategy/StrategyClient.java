package strategy;

import strategy.ducks.Duck;
import strategy.ducks.MallardDuck;
import strategy.ducks.ModelDuck;
import strategy.flybehaviors.FlyRocketPowered;

public class StrategyClient {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        /**
         * This calls MallardDuck's inherited performQuack, which then delegates to the object's QuackBehavior (i.e. calls quack()
         * on the duck's inherited quackBehavior reference).
         */
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
