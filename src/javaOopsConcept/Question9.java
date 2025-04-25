//9. Animal Sounds (super Keyword)
//Create a base class `Animal` with a method `makeSound()`. Extend it with `Cat` and `Dog` classes.
//In overridden methods, first call `super.makeSound()` and then add animal-specific sound logic.

package javaOopsConcept;

class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Meow!");
    }
}

// Dog class extending Animal
class Dog extends Animal {
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Woof!");
    }
}
public class Question9 {

    public static void main(String[] args) {

        Animal genericAnimal = new Animal();
        genericAnimal.makeSound();

        Cat myCat = new Cat();
        myCat.makeSound();

        Dog myDog = new Dog();
        myDog.makeSound();
    }
}
