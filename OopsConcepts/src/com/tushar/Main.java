package com.tushar;

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
    
    void playFetch() {
        System.out.println("Dog is playing fetch");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        // Upcasting: Dog object to Animal reference
        Animal animal = new Dog();
        
        // This will call the overridden method in Dog class
        animal.makeSound();  // Output: Dog barks
        
        // Downcasting: Animal reference to Dog reference
        Dog dog = (Dog) animal;
        
        // Now, Dog reference has access to Dog-specific methods
        dog.playFetch();     // Output: Dog is playing fetch
        
        // Upcasting: Cat object to Animal reference
        Animal catAnimal = new Cat();
        
        // This will call the overridden method in Cat class
        catAnimal.makeSound();  // Output: Cat meows
    }
}
