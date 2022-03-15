//Print all the static, instance variables in main method

class Sample2{
	//static variables
	static int var1=10;
	
	//instance variables
		int a=2;
		double b=3;
	
}	
	
class Stat6{
	//main method
	static double var2=20.0;
		public static void main(String args[]) {
			System.out.println("var 1 value "+Sample2.var1);//different class
			System.out.println("var 2 value "+var2);//same class
			Sample2 s=new Sample2();
			System.out.println("a value "+s.a);
			System.out.println("b value "+s.b);
		}
}