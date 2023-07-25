/**
 * A generic class that demonstrates method overloading in Java.
 * The class allows performing different actions based on the type of input.
 *
 * @param <T> The generic type parameter that can be replaced with any type during instantiation.
 */
//* DEFINITION
// Method overloading allows the same method name with different parameter lists
// The decision on which method to call is determined at compile-time based on the arguments provided
public class GenericClass<T> {

    /**
     * Performs an action on the input item of type T.
     *
     * @param item The item of type T on which the action will be performed.
     */
    public void doSomething(T item) {
        System.out.println("Doing something with: " + item);
    }

    /**
     * Performs an action on the input integer.
     *
     * @param number The integer on which the action will be performed.
     */
    public void doSomething(int number) {
        System.out.println("Doing something with integer: " + number);
    }

    /**
     * Performs an action on the input string.
     *
     * @param text The string on which the action will be performed.
     */
    public void doSomething(String text) {
        System.out.println("Doing something with string: " + text);
    }

    /**
     * Performs an action on both the input item of type T and an integer.
     *
     * @param item   The item of type T on which the action will be performed.
     * @param number The integer on which the action will be performed.
     */
    public void doSomething(T item, int number) {
        System.out.println("Doing something with: " + item + " and integer: " + number);
    }

    /**
     * Main method to demonstrate the usage of the GenericClass.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Create an instance of GenericClass with Integer type parameter
        GenericClass<Integer> intClass = new GenericClass<>();

        // Create an instance of GenericClass with String type parameter
        GenericClass<String> stringClass = new GenericClass<>();

        // Invokes the int version of doSomething
        intClass.doSomething(42);

        // Invokes the String version of doSomething
        stringClass.doSomething("Hello");

        // Invokes the generic version with two parameters
        intClass.doSomething(100, 200);

        // Invokes the generic version with two parameters
        stringClass.doSomething("Hi", 123);
    }
}
