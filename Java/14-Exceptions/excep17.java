//Write a program to generate StringIndexOutOfBoundsException


class excep17 {
   public static void main(String[] args) {
      String str = "Hello how are you";
      System.out.println("Length of the String: "+str.length());
      for(int i=0; i<str.length(); i++) {
         System.out.println(str.charAt(i));
      }
      //Accessing element at greater than the length of the String
      System.out.println(str.charAt(40));
   }
}