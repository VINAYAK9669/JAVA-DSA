// Program to Introduce Genric Method in java

public class Main
{
    // Define a generic method , this is the syntax for the generic method
    public <T> void GenericMethod(T parameter)
    {
        System.out.println(parameter);
    }
    public static void main(String args[])
    {
        // We will create an instnce of the class i,e Object
        Main object=new Main();
      
        // Now we will call method of the class Main with passing arguments
        object.GenericMethod(5);   // passed an integer value
        object.GenericMethod("Vinayak"); // passsed String
        object.GenericMethod(5.677); // passed double value
    }
}
