//Create an instance for the child class in child class and call non-abstract method

abstract class Language {

  // method of abstract class
  public void display() {
    System.out.println("This is Java Programming");
  }
}

class Abst4 extends Language {

  public static void main(String[] args) {
    Abst4 obj = new Abst4();
    obj.display();
  }
}