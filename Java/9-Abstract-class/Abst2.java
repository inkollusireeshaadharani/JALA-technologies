//Create a sub class for an abstract class. Create an object in the child class for the 
//abstract class and access the non-abstract methods


//abstract class cannot be instantiated



abstract class Abs
{
  abstract void callme();
  public void show()
  {
    System.out.println("this is non-abstract method");
  }
}

class Abst2 extends Abs
{
  void callme()
  {
    System.out.println("Calling...");
  }
  public static void main(String[] args)
  {
    Abst2 b = new Abst2();
    b.callme();
    b.show();
  }
}