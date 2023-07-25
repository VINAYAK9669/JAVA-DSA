/**
 * Generic Pair Class
 * 
 * This class represents a generic pair of two values with types T and U.
 * It provides methods to set and retrieve the first and second values, as well as
 * a method to print the pair values.
 *
 * @param <T> The type of the first value.
 * @param <U> The type of the second value.
 */
public class Main<T, U> {
    // Instance variables to store the pair values
    private T first;
    private U second;
    
    /**
     * Constructor for Pair class.
     * 
     * @param first The first value of type T.
     * @param second The second value of type U.
     */
    public Main(T first, U second) {
        this.first = first;
        this.second = second;
    }
    
    /**
     * Get the first value of the pair.
     * 
     * @return The first value of type T.
     */
    public T getFirst() {
        return first;
    }
    
    /**
     * Set the first value of the pair.
     * 
     * @param first The first value of type T to set.
     */
    public void setFirst(T first) {
        this.first = first;
    }
    
    /**
     * Get the second value of the pair.
     * 
     * @return The second value of type U.
     */
    public U getSecond() {
        return second;
    }
    
    /**
     * Set the second value of the pair.
     * 
     * @param second The second value of type U to set.
     */
    public void setSecond(U second) {
        this.second = second;
    }
    
    /**
     * Print the pair values.
     */
    public void printPair() {
        System.out.println("First Value: " + first);
        System.out.println("Second Value: " + second);
    }
    
    /**
     * Main method to demonstrate the usage of the Pair class.
     * 
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Create a Pair object with Integer and String types
        Main<Integer, String> pair = new Main<>(10, "Hello");
        
        // Access and print the pair values
        System.out.println("Printing Pair Values:");
        pair.printPair();
    }
}
