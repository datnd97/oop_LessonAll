package animal;
import edible.*;
public class Tiger extends Animal  implements  Edible{
    @Override
    public String makeSound() {
        return "Tiger gurrrrrr";
    }
    @Override
    public String howEat() {
        return "could be beef";
    }
}
