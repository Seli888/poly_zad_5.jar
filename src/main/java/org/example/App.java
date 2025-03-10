package org.example;

public class App {
    public static void main(String[] args) {
        Animal animalDog = new Dog();
        animalDog.makeSound();
        Animal animalCat = new Cat();
        animalCat.makeSound();
    }
}
