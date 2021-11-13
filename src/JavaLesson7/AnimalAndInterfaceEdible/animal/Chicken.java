package JavaLesson7.AnimalAndInterfaceEdible.animal;


import JavaLesson7.AnimalAndInterfaceEdible.edible.edible;

public class Chicken extends Animal implements edible {

    @Override
    public String makeSound() {
        return "Chicken : cluck - cluck";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
