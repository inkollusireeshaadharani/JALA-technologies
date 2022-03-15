//Write a program to create your own exception

@SuppressWarnings("serial")
class CustomException extends Exception {
	   String message;
	   CustomException(String str) {
	      message = str;
	   }
	   public String toString() {
	      return ("Custom Exception Occurred : " + message);
	   }
	}
class excep6{
	   public static void main(String args[]) {
	      try {
	         throw new CustomException("This is a custom message");
	      } catch(CustomException e) {
	         System.out.println(e);
	      }
	   }
}