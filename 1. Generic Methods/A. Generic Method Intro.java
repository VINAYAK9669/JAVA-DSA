// Program to Introduce Generic Method in java

//***********Theory of Generic Method*****************
/*
Question 1) What is the syntax for the Generic method?


     ---->:  public <T> ReturnType methodName(ParameterType parameterName) 
                          {
                              // Method implementation
                          }
            * public: Is an access modifier indicates visibility of the method, Here in this place it can be 'private', 'protected'
           
            * <T>: This is a DECLARATION of "Type parameter", we can replace it with any valid identifier. It indicates method can 
                   work with different types.

            * ReturnType: This is the type that method return. (Ex: Integer, String, void)

            * ParameterType : This is the type of parameter that the method will accept.



Question 2) Just provide the all the possible syntax for GENERIC METHODS explain in brief.

      ---->:    The other syntax we used are for different type parameters, generally for  
  
                    1) Bounded Type Parameters
                    2) Multiple Type Parameters
                    3) Wildcard Parameters
                    5) Generic Method in Generic class
                    6) Static Generic Method:
                    7) Returning Generic Type:
     
           1) Bounded Type Parameters

                    * Used to restrict the types that can be used as the generic type.
                    * Ex: If we want to restrict the type "T" to only accept types that implement a specific
                          interface "MyInterface" 
                    * Syntax:
                            public <T extends MyInterface> void methodWithBoundedType(T parameter) 
                                            {
                                                // Method implementation
                                            }
                    * Example of Interfaces in java: "Comparable", "Iterable", "List", "Set", "Map", "EventListener"


         2) Multiple Type Parameters:

                    * Used to take multiple parameters
                    * Syntax:
                        public <T, U> void methodWithMultipleParameters(T first, U second) 
                                {
                                    // Method implementation
                                }

        3) Wildcard Parameters:
                
                    * Can be used to accept generic types of unknown or specific subtype relationships.
                    * Syntax: 
                    public void methodWithWildcard(List<?> list) 
                                {
                                    // Method implementation
                                }

        4) Generic Method in Generic Class:

                    * Syntax:
                                public class MyGenericClass<T> 
                                        {
                                            public <U> void genericMethodInGenericClass(U parameter) {
                                                // Method implementation
                                            }
                                        }


        5) Static Generic Method: 
   
                    * Static methods can also be generic:
                    * Syntax:
                            public class MyUtils 
                                    {
                                        public static <T> void staticGenericMethod(T parameter) {
                                            // Method implementation
                                        }
                                    }

        6) Returning Generic Type:
    
                    * You can return a generic type from a method:
                    * Syntax:
                                public <T> T methodReturningGenericType(T parameter) 
                                                    {
                                                        // Method implementation
                                                        return parameter;
                                                    }

*/

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
