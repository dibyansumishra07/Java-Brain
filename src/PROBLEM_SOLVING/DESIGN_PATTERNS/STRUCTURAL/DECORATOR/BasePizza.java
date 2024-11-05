package PROBLEM_SOLVING.DESIGN_PATTERNS.STRUCTURAL.DECORATOR;

/*
 * If we don't use the decorator design pattern then below can be the architecture
 * - Base Pizza Abstract Class: With one abstract method cost
 *   > VegDelight
 *   > NonVegDelight
 * - Mushroom Pizza will extend the BasePizza and mention the new cost and same for all types of pizza.
 * - With this Approach we will end up with class explosion. Where we have n number of classes with just one functionality.
 * -----------------------------------------------------------------------------------------------------------------
 * Solution: Implementing Decorator Design Pattern
 * - BasePizza: we have two base pizzas below
 *   > VegDelight
 *   > NonVegDelight
 * - ToppingDecorator or FeatureDecorator: which will be abstract and maintain has-a and is-a relationship with base pizza.
 *   > ToppingDecorator will extend the base pizza (is-a) and keep a base pizza (has-a) variable as well.
 * - MushroomPizza: Extends ToppingDecorator and maintain is-a relationship. And also keeping an object of base pizza and maintaining has-a with base pizza.
 * */

// ! Abstract base pizza
public abstract class BasePizza {
    public abstract int cost();
}

// ! Base Pizza 1
class VegDelight extends BasePizza {

    @Override
    public int cost() {
        return 100;
    }
}

// ! Base Pizza 2
class NonVegDelight extends BasePizza {

    @Override
    public int cost() {
        return 150;
    }
}

// ! Decorator abstract class which will work as helper for adding toppings
abstract class ToppingDecorator extends BasePizza {
}

// ! CheeseAddOn class which is a base pizza and has a base pizza
class CheeseAddOn extends ToppingDecorator {
    // ! Declaring a base pizza who will need toppings
    BasePizza basePizza;

    // ! Doing constructor injection of base pizza who is needing toppings
    public CheeseAddOn(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    //! Calculating cost based on the base pizza and topping price.
    @Override
    public int cost() {
        return basePizza.cost() + 15;
    }
}

// ! MushroomAddOn class which is a base pizza and has a base pizza
class MushroomAddOn extends ToppingDecorator {
    // ! Declaring a base pizza who will need toppings
    BasePizza basePizza;

    // ! Doing constructor injection of base pizza who is needing toppings
    public MushroomAddOn(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    //! Calculating cost based on the base pizza and topping price.
    @Override
    public int cost() {
        return basePizza.cost() + 50;
    }
}

class DecoratorDesignPatternRunner {
    public static void main(String[] args) {
        BasePizza basePizza = new CheeseAddOn(new MushroomAddOn(new NonVegDelight()));
        BasePizza basePizzaWithExtraCheese = new CheeseAddOn(new CheeseAddOn(new MushroomAddOn(new NonVegDelight())));
        System.out.println("basePizza with basic addon cost: " + basePizza.cost());
        System.out.println("basePizza with basic addon and extra cheese cost: " + basePizzaWithExtraCheese.cost());
    }
}