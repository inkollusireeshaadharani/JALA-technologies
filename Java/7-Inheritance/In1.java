/*
 	A, B and C are classes
 	
	A is a super class.
 	B is a sub class of A. 
 	C is a sub class of B. 
 	
	Create three methods in each class, 2 methods are specific to each class and third 
	method (override method) should be in all three Classes A, B and C
	
	Create a class with main method. Create an object for each class A, B and C in main 
	method and call every method of each class using its own object/instance.
	
	Call an overridden method with super class reference to B and C class’s objects
	
	Runtime Polymorphism with Data Members/Instance variables, Repeat the above 
	process only for data member
	
 */
class A{
	int a1=10;
	int a2=20;
	int com=30;
	public void methA1() {
		System.out.println("Method 1 of class A");
	}
	public void methA2() {
		System.out.println("Method 2 of class A");
	}
	public void common() {
		System.out.println("Not overridden. -->Class A");
	}
}

class B extends A{
	int b1=100;
	int b2=200;
	int com=300;
	public void methB1() {
		System.out.println("Method 1 of class B");
	}
	public void methB2() {
		System.out.println("Method 2 of class B");
	}
	public void common() {
		System.out.println("Overriden in Class B");
	}
	
}

class C extends B{
	int c1=1000;
	int c2=2000;
	int com=3000;
	public void methC1() {
		System.out.println("Method 1 of class C");
	}
	public void methC2() {
		System.out.println("Method 2 of class C");
	}
	public void common() {
		System.out.println("Overriden in Class C");
	}
	
}

class In1{
	public static void main(String args[]) {
		A a=new A();
		B b=new B();
		C c=new C();
		
		a.methA1();
		a.methA2();
		a.common();
		System.out.println("------------------------------------------------------------- ");
		b.methB1();
		b.methB2();
		b.common();
		System.out.println("------------------------------------------------------------- ");
		c.methC1();
		c.methC2();
		c.common();
		System.out.println("------------------------------------------------------------- ");
		A ref=new A();
		ref.common();
		System.out.println("com value "+ref.com);
		System.out.println("------------------------------------------------------------- ");
		
		ref=new B();
		ref.common();
		System.out.println("com value "+ref.com);   //cannot be achieved with data members
		System.out.println("------------------------------------------------------------- ");
		
		ref=new C();
		ref.common();
		System.out.println("com value "+ref.com);
		
	}
}

















