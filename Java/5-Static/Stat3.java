//Print static variables in Instance method

class Sample{
	//static variables
	static int var1=10;
	static double var2=20.0;
	
	
}	
	
class Stat3{
	//instance method
		public void display() {
			System.out.println("static variable 1 value is "+Sample.var1);  //using class name
			System.out.println("static variable 2 value is "+Sample.var2);
		}
		public static void main(String args[]) {
				Stat3 s=new Stat3();
				s.display();
		}
}