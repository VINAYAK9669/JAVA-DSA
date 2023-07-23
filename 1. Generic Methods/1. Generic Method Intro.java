public class Main
{

  static class DemoClass < T >
  {				// Make DemoClass a static inner class and add generic type parameter
    void genericPrint (T t)
    {

      System.out.println (t);

    }
  }

  public static void main (String[]args)
  {

    DemoClass < Integer > aObj = new DemoClass <> ();	// Create an instance of DemoClass with Integer type
    aObj.genericPrint (101);


    DemoClass < String > bObj = new DemoClass <> ();	// Create an instance of DemoClass with String type
    bObj.genericPrint ("Hello");


    DemoClass < Double > cObj = new DemoClass <> ();	// Create an instance of DemoClass with Double type
    cObj.genericPrint (3.14);

  }
}
