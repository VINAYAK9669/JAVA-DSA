/**
 * This is a sample Java program demonstrating the use of wild cards in generics.
 * It defines a generic class called "AnimalShelter" that can store a list of animals
 * and perform some operations on them. The program showcases how wild cards can be used
 * to provide flexibility in working with different types while maintaining type safety.
 */

import java.util.List;
import java.util.ArrayList;

/**
 * The Animal class represents a generic animal.
 */
class Animal {
    // Some animal-specific properties and methods
}

/**
 * The Dog class represents a specific type of animal, i.e., a dog.
 * It extends the Animal class.
 */
class Dog extends Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

/**
 * The AnimalShelter class is a generic class that can store a list of animals.
 * The type argument 'T' is restricted to be a subtype of Animal using the upper-bounded wild card.
 * @param <T> The type of animal to be stored in the shelter.
 */
 class AnimalShelter<T extends Animal> {
    private List<T> animals;

    /**
     * Constructor to create an AnimalShelter with a list of animals.
     * @param animals The list of animals to be stored in the shelter.
     */
    public AnimalShelter(List<T> animals) {
        this.animals = animals;
    }

    /**
     * Method to add an animal to the shelter.
     * @param animal The animal to be added to the shelter.
     */
    public void addAnimal(T animal) {
        animals.add(animal);
    }

    /**
     * Method to get an animal from the shelter based on its index.
     * @param index The index of the animal in the shelter.
     * @return The animal object at the specified index.
     */
    public T getAnimal(int index) {
        return animals.get(index);
    }

    // Some other methods related to the animal shelter
}

/**
 * Main class to execute the program.
 */
public class Main {
    public static void main(String[] args) {
        // Create a list of dogs
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Buddy"));
        dogs.add(new Dog("Max"));

        // Create an AnimalShelter specifically for dogs
        AnimalShelter<Dog> dogShelter = new AnimalShelter<>(dogs);

        // Add a new dog to the shelter
        dogShelter.addAnimal(new Dog("Charlie"));

        // Get and print the name of the first dog in the shelter
        Dog firstDog = dogShelter.getAnimal(0);
        System.out.println("First dog's name: " + firstDog.getName());
    }
}
