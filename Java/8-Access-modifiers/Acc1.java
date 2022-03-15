//Create a class with PRIVATE fields, private method and a main method. Print the fields 
//in main method. Call the private method in main method.
//Create a sub class and try to access the private fields and methods from sub class

class Acc1
{
	private int var1=9;
	private int var2=99;
	private void myMethod() {
		System.out.println("Private method");
	}
	public static void main (String args[]) {
		Acc1 a=new Acc1();
		System.out.println(a.var1);
		System.out.println(a.var2);
		a.myMethod();
	}
}

class Acc1Sub1 extends Acc1{
	void display() {
		//System.out.println(var1);           //accessing private members causes errors
		//myMethod();
	}
	
}