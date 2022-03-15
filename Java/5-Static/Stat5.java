//Call static methods in instance method

class Another{
	//static variables
	static void method1() {
		System.out.println("inside static method");
	}
	
	
	
}	
	
class Stat5{
	//instance method
		public void display() {
			Another.method1();                       //using class name
		}
		public static void main(String args[]) {
				Stat5 s=new Stat5();
				s.display();
		}
}