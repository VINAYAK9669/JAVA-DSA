/**
 * This is a Java program that demonstrates a generic method (using static) with a return type of Integer.
 * The program includes a generic method that calculates the sum of elements in an array of any numeric type.
 *
 * @author Vinayak Kittad
 * @version 1.0
 * @since Date (e.g., 2023-07-24)
 */

public class Main {
    // Generic method to calculate the sum of elements in an array of any numeric type
    public static <T extends Number> Integer sumArray(T[] array) {
        // this fucntion returns an Interger hence need to consider Integer varibale to get the summation of array elements
        Integer sum=0;
        for(T element:array)
        {
            sum += element.intValue();
        }
        return sum;
    }
    // Main method to demonstrate the usage of the generic method
    public static void main(String[] args) {
        
        // creating an array of Integer
        Integer array[] ={5,4, 3, 1, 5, 8};
        System.out.print(sumArray(array));
    }
}
