//Write a program to generate NullPointerException

class excep15 {
   private static Object ref;

public static void main(String[] args) {
      ref = null;
      ref.toString(); // this will throw a NullPointerException
   }
}