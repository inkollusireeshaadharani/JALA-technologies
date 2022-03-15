//Write a program with finally block

class excep7{
	public static void main(String args[]) {
		int a=10,b=0,c;
		try {
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e){
			
			System.out.println(e);
		}
		finally {
			System.out.println("Exception handling performed");
		}
	}
}