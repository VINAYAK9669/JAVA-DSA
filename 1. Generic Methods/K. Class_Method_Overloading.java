/**
 * MethodOverloadingDemo is a Java class that illustrates method overloading.
 * Method overloading allows the class to have multiple methods with the same name
 * but different parameter lists, enabling the class to handle different types of input.
 * This class showcases various overloaded methods to print different types of values.
 */
public class MethodOverloadingDemo {

    // Method overloading allows the same method name with different parameter lists
    // The decision on which method to call is determined at compile-time based on the arguments provided

    /**
     * Prints the provided integer value.
     *
     * @param number The integer value to be printed.
     */
    public void printValue(int number) {
        System.out.println("Printing integer: " + number);
    }

    /**
     * Prints the provided double value.
     *
     * @param number The double value to be printed.
     */
    public void printValue(double number) {
        System.out.println("Printing double: " + number);
    }

    /**
     * Prints the two provided integer values.
     *
     * @param a The first integer value to be printed.
     * @param b The second integer value to be printed.
     */
    public void printValue(int a, int b) {
        System.out.println("Printing integers: " + a + ", " + b);
    }

    /**
     * Prints the provided string value.
     *
     * @param text The string value to be printed.
     */
    public void printValue(String text) {
        System.out.println("Printing string: " + text);
    }

    /**
     * The main method demonstrates method overloading in action.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        MethodOverloadingDemo demo = new MethodOverloadingDemo();

        demo.printValue(10);         // Calls the method with int parameter
        demo.printValue(3.14);       // Calls the method with double parameter
        demo.printValue("Hello");    // Calls the method with String parameter
        demo.printValue(1, 2);       // Calls the method with two int parameters
    }
}
