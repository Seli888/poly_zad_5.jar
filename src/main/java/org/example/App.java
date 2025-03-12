package org.example;
import java.util.Arrays;


public class App {
    public static void main(String[] args) {
    Animal[] newAnimal = new Animal[] { new Animal(), new Dog(), new Cat()};
    for (int i = 0; i < newAnimal.length; i++){
        newAnimal[i].makeSound();
        }
    }
}
