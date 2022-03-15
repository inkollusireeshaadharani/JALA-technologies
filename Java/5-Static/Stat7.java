//Call static methods and instance methods in main method
class Another2{
	//static variables
	static void method1() {
		System.out.println("inside static method");
	}
	
	
	
}	

class Stat7{
	                                                //instance methods
	public void display() {
		System.out.println("Display method");
	}
	
	public void show() {
		System.out.println("Show method");
	}   
	
	
	public static void main(String args[]) {        //static method
		Stat7 s=new Stat7();
		s.display();               //calling instance methods in main method
		s.show();
		Another2.method1();        //calling static methods inside main method
	}
}