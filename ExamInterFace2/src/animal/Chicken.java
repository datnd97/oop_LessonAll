package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken chip chip";
    }

    @Override
    public String howEat() {
        return "count be fried";
    }
}
