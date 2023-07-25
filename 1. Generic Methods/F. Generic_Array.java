/**
 * This is a Java program that demonstrates a GenericArray class.
 * The GenericArray class is a simple implementation of a generic array that can store elements of any data type.
 * The program includes a main method to demonstrate the usage of the GenericArray class with different data types.
 * 
 * Note: For demonstration purposes, we are considering a simple array implementation.
 * In practice, you can use built-in Java collections or more advanced data structures.
 * 
 * Note: The GenericArray class uses a type parameter T to represent the element type of the array.
 * It provides methods to initialize, access, and modify elements of the generic array.
 * 
 * Note: The implementation provides basic functionalities but does not include bounds checking or advanced array features.
 * 
 * Note: The array is created as an Object array (Object[]) and then type-casted to T[] using an unchecked cast.
 * This is due to type erasure in Java generics, where the specific type of T is not available at runtime.
 * The unchecked cast should work correctly as long as the GenericArray class is used with the same type as the type parameter T.
 * 
 * @param <T> The type parameter T represents the element type of the array.
 * @Vinayak Kittad
 * @version 1.0
 * @since Date 2023-07-24
 */
public class GenericArray<T> {
    private T[] array;

    /**
     * Constructor to create a GenericArray of the specified size.
     * 
     * @param size The size of the array to be created.
     */
    public GenericArray(int size) {
        // Create an Object array of the specified size (unchecked cast to T[])
        array = (T[]) new Object[size];
        /*
        * Since Java arrays are covariant, this array can hold references to objects of any type, including Integer, String, and other classes.
        * This unchecked cast is necessary because Java does not allow creating arrays directly using type parameters, 
          so we create an array of type Object and then cast it to the desired generic type T.
        */
    }

    /**
     * Method to set the element at the given index in the array.
     * 
     * @param index The index at which the element should be set.
     * @param element The element to be stored in the array.
     */
    public void set(int index, T element) {
        array[index] = element;
    }

    /**
     * Method to get the element at the given index from the array.
     * 
     * @param index The index from which the element should be retrieved.
     * @return The element at the specified index.
     */
    public T get(int index) {
        return array[index];
    }

    /**
     * Main method to demonstrate the usage of the GenericArray class.
     * 
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create a GenericArray of Integer type and set elements
        GenericArray<Integer> intArray = new GenericArray<>(5);
        intArray.set(0, 10);
        intArray.set(1, 20);
        intArray.set(2, 30);

        // Retrieve and print elements from the Integer array
        System.out.println("Element at index 0: " + intArray.get(0)); // Output: Element at index 0: 10
        System.out.println("Element at index 1: " + intArray.get(1)); // Output: Element at index 1: 20
        System.out.println("Element at index 2: " + intArray.get(2)); // Output: Element at index 2: 30

        // Create a GenericArray of String type and set elements
        GenericArray<String> strArray = new GenericArray<>(3);
        strArray.set(0, "Hello");
        strArray.set(1, "Generics");

        // Retrieve and print elements from the String array
        System.out.println("Element at index 0: " + strArray.get(0)); // Output: Element at index 0: Hello
        System.out.println("Element at index 1: " + strArray.get(1)); // Output: Element at index 1: Generics
    }
}
