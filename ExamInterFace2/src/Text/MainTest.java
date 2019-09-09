package Text;
import animal.*;
import fruit.Apple;
import fruit.Fruit;
import fruit.Orange;
import org.w3c.dom.ls.LSOutput;

public class MainTest {
    public static void main(String[] args) {
        Animal tiger = new Tiger();
        System.out.println( tiger.makeSound());
        Animal chicken = new Chicken();
        System.out.println(chicken.makeSound());

        Fruit apple = new Apple();
        Fruit orange = new Orange();

        System.out.println(apple.howEat());
        System.out.println(orange.howEat());

        Animal []animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for (Animal animal: animals) {
            System.out.println(animal.makeSound());
        }


        Fruit []fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for(Fruit fruit : fruits) {
            System.out.println(fruit.howEat());
        }
    }
}
