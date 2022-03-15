//Write a method which throws exception, Call that method in main class without try block

//problem arises

class excep3{
	static void display() throws Exception{
		int a=10,b=0,c;
		c=a/b;
		System.out.println(c);
	}
	public static void main(String args[]) {
		//display();
	}
}