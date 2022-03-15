//Write a program with multiple catch blocks
class excep4{
	public static void main(String args[]) {
		int a=10,b=0,c;
		try {
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}