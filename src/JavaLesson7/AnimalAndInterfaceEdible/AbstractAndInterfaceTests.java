package JavaLesson7.AnimalAndInterfaceEdible;

import JavaLesson7.AnimalAndInterfaceEdible.animal.Animal;
import JavaLesson7.AnimalAndInterfaceEdible.animal.Chicken;
import JavaLesson7.AnimalAndInterfaceEdible.animal.Tiger;
import JavaLesson7.AnimalAndInterfaceEdible.edible.edible;
import JavaLesson7.AnimalAndInterfaceEdible.fruit.Apple;
import JavaLesson7.AnimalAndInterfaceEdible.fruit.Fruit;
import JavaLesson7.AnimalAndInterfaceEdible.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();

        for (Animal x: animals
             ) {
            System.out.println(x.makeSound());

            if ( x instanceof Chicken) {
                edible edibler = (Chicken) x;
                System.out.println(edibler.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();

        for (Fruit x: fruits
             ) {
            System.out.println(x.howToEat());
        }


    }
}
