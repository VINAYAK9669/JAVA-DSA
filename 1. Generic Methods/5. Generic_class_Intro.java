/**
 * This is a Java program that demonstrates the usage of a Generic class called `Box`.
 * The `Box` class is a Generic class that can work with any data type `T`.
 * It includes a constructor, getter, and setter methods to handle data of type `T`.
 * The program also demonstrates the usage of the `Box` class with `Integer` and `String` data types.
 * 
 * Note: For demonstration purposes, we are considering simple use cases with Integer and String data types.
 * In practice, you can use the `Box` class with other data types as well.
 * 
 * Note: The Generic class `Box` allows for type safety and code reusability when working with different data types.
 * The class is defined with a type parameter `T`, which acts as a placeholder for the actual data type.
 * The constructor and methods inside the class use the type parameter `T` to work with the specified data types.
 * 
 * Note: The `Box` class also demonstrates the usage of getter and setter methods to access and modify the value inside the box.
 * 
 * @author Vinayak Kittad
 * @version 1.0
 * @since 2023-07-24
 */
public class Box<T> {
    private T value;

    /**
     * Constructor for the `Box` class.
     * Initializes the Box object with the specified value of type `T`.
     * 
     * @param value The value of type `T` to be stored inside the Box.
     */
    public Box(T value) {
        this.value = value;
    }

    /**
     * Getter method to retrieve the value stored in the Box.
     * 
     * @return The value of type `T` stored inside the Box.
     */
    public T getValue() {
        return value;
    }

    /**
     * Setter method to set the value inside the Box.
     * 
     * @param value The value of type `T` to be set inside the Box.
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * Main method to demonstrate the usage of the `Box` class.
     * 
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create a Box object with Integer data type and assign it the value 10
        Box<Integer> integerBox = new Box<>(10);

        // Create another Box object with String data type and assign it the value "Hello, Generics!"
        Box<String> stringBox = new Box<>("Hello, Generics!");

        // Retrieve and print the value from the Integer Box
        System.out.println("Integer Value: " + integerBox.getValue()); // Output: Integer Value: 10

        // Retrieve and print the value from the String Box
        System.out.println("String Value: " + stringBox.getValue());   // Output: String Value: Hello, Generics!
    }
}
