//Write a program to throw exception with your own message

class excep5{
	public static void main(String args[]) {
		int a=10,b=0,c;
		try {
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e){
			System.out.println("Caught the exception");
		}
	}
}