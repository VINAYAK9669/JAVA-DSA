/**
 * This is a Java program that demonstrates overloaded generic methods for swapping elements of different types.
 * The program includes methods that can swap elements of different data types.
 * In this example, we demonstrate swapping elements for integer, string, and double types.
 * Note: The individual swap methods can be expanded to handle other data types as well.
 * 
 * Note: For demonstration purposes, we are considering simple individual element swaps.
 * In practice, you can extend this concept to handle more complex data structures.
 * 
 * @Vinayak Kittad
 * @version 1.0
 * @since Date (e.g., 2023-07-24)
 */
public class Main {

    /**
     * Generic method to swap two elements of any reference type.
     *
     * @param element1 The first element to be swapped.
     * @param element2 The second element to be swapped.
     * @param <T> The type of elements to be swapped (Any reference type).
     */
    public static <T> void swap(T element1, T element2) {
        T temp = element1;
        element1 = element2;
        element2 = temp;
        System.out.println("After swapping: num1 = " + element1 + ", num2 = " + element2);
    }

    public static void main(String[] args) {
        // Swapping integers
        int num1 = 5;
        int num2 = 10;
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
        swap(num1, num2);
        System.out.println();
        
        // Swapping strings
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("Before swapping: str1 = " + str1 + ", str2 = " + str2);
        swap(str1, str2);
        System.out.println();
        
        // Swapping integers and strings
        int number = 15;
        String message = "Swap me!";
        System.out.println("Before swapping: number = " + number + ", message = " + message);
        swap(number, message);
        System.out.println();
        
        // Swapping strings and doubles
        String name = "John";
        double salary = 5000.0;
        System.out.println("Before swapping: name = " + name + ", salary = " + salary);
        swap(name, salary);
    }
}

