package animal;
import edible.Edile;
public class  Chicken extends Animal implements Edile {
        @Override
        public String makeSound() {
            return "Chicken: cluck-cluck";
        }
        @Override
        public String howToEat() {
            return "could be fried";
        }
}
