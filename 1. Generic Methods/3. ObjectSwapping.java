/**
 * This is a Java program that demonstrates a generic method for swapping two objects of any type.
 * The program includes a class `Person` representing a person with name and marks, and a `swap` method
 * to swap objects of any type.
 * 
 * Note: For demonstration purposes, we are considering simple individual element swaps.
 * In practice, you can extend this concept to handle more complex data structures.
 * 
 * Note: The `Person` class has an overridden `toString()` method to provide a custom string representation of a `Person` object.
 * The custom `toString()` method is used to display meaningful information when a `Person` object is converted to a string.
 * 
 * @Vianayak Kittad
 * @version 1.0
 * @2023-07-24
 */
class Person {
    String name;
    float marks;

    /**
     * Constructor for the `Person` class.
     * 
     * @param name The name of the person.
     * @param marks The marks of the person.
     */
    Person(String name, float marks) {
        this.name = name;
        this.marks = marks;
    }

    /**
     * Overriding the `toString()` method to provide a custom string representation of the `Person` object.
     * 
     * @return A string representation of the `Person` object in the format "Name (Marks)".
     */
    @Override
    public String toString() {
        return name + " (" + marks + ")";
    }
}

public class Main {
    /**
     * Generic method to swap two objects of any type.
     * 
     * @param x The first object to be swapped.
     * @param y The second object to be swapped.
     */
    public static void swap(Object x, Object y) {
        Object t = x; // Temporary variable to hold the value of x
        x = y; // Assigning the value of y to x
        y = t; // Assigning the value of the temporary variable t to y

        System.out.println("After swapping: p1 = " + x + ", p2 = " + y); // Printing the values of p1 and p2 after swapping
    }

    public static void main(String[] args) {
        // Creating two `Person` objects
        Person p1 = new Person("Sumit", 99.99f);
        Person p2 = new Person("Rahul", 66.6f);

        System.out.println("Before swapping: p1 = " + p1 + ", p2 = " + p2); // Printing the original values of p1 and p2
        swap(p1, p2); // Calling the `swap` method with p1 and p2 as arguments
    }
}
