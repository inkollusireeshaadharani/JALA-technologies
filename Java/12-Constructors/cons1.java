//Write a class with a default constructor, one argument constructor and two argument 
//constructors. Instantiate the class to call all the constructors of that class from a main 
//class

class cons1{
	int a;
	cons1(){
		System.out.println("Constructor 1");
	}
	cons1(int a){
		System.out.println("Constructor 2");
	}
	cons1(int a,int b){
		System.out.println("Constructor 3");
	}
	public static void main(String args[]) {
		cons1 c1=new cons1();
		cons1 c2=new cons1(2);
		cons1 c3=new cons1(2,3);
		c1.a=10;
		c2.a=10;
		c3.a=10;
	}
}