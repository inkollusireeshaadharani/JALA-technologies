package pack;
//Create a class with PROTECTED fields and methods. Access these fields and methods 
//from any other class in the same package. 
//Also, Access the PROTECTED fields and methods from child class located in a different 
//package
//Access the PROTECTED fields and methods from any class in different package

class myC3{
	protected int i=56;
	protected void display() {
		System.out.println(i);
	}
}

public class Acc3{
	int j=10;
	protected void show() {
		System.out.println(j);
	}
	public static void main(String args[]) {
		myC3 m=new myC3();
		m.display();
	}
}