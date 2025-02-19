package Polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {
        Animal myAnimal;  // Reference of superclass

        myAnimal = new Dog();
        myAnimal.makeSound(); // Calls Dog's version of makeSound()

        myAnimal = new Cat();
        myAnimal.makeSound(); // Calls Cat's version of makeSound()
        
        myAnimal = new Animal();
        myAnimal.makeSound();
    }
}


class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}
