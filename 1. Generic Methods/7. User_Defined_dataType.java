/**
 * This is a Java program that demonstrates a generic class `Box` with a user-defined data type `Person`.
 * The `Box` class is a generic class that can store elements of any data type T.
 * In this example, T is replaced with the user-defined data type `Person`.
 * The program includes a main method to demonstrate the usage of the `Box` class with the `Person` data type.
 * 
 * Note: For demonstration purposes, we are considering a simple class `Person` representing a person with name and age.
 * In practice, you can use any user-defined data type with the `Box` class.
 * 
 * Note: The `Box` class uses a type parameter T to represent the element type of the array.
 * It provides methods to initialize, access, and modify elements of the generic array.
 * 
 * Note: The implementation provides basic functionalities but does not include bounds checking or advanced array features.
 * 
 * @param <T> The type parameter T represents the user-defined data type.
 * @Vinayak Kittad
 * @version 1.0
 * @since 2023-07-24
 */
 
// Definition of the Person class representing a person with name and age
class Person {
    private String name;
    private int age;

    // Constructor to initialize the Person object with a name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding the toString() method to provide a custom string representation of the Person object
    @Override
    public String toString() {
        return name + " (" + age + " years old)";
    }
}

// Generic class definition: A class that can work with any data type T
public class Box<T> {
    private T value;

    // Constructor to create a Box object with the specified value of type T
    public Box(T value) {
        this.value = value;
    }

    // Getter method to retrieve the value stored in the Box
    public T getValue() {
        return value;
    }

    // Setter method to set the value inside the Box
    public void setValue(T value) {
        this.value = value;
    }

    // Main method to demonstrate the usage of the GenericArray class
    public static void main(String[] args) {
        // Create a Box object with Person data type and assign it a Person object
        Person person = new Person("John Doe", 30);
        Box<Person> personBox = new Box<>(person);

        // Retrieve and print the Person object from the Box
        System.out.println("Person: " + personBox.getValue()); // Output: Person: John Doe (30 years old)
    }
}
