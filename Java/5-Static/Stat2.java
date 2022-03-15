//Print instance variables in static methods

class Stat2{
	int inVar=10;                                   //instance variable
	public static void main(String args[]) {        //static method
		Stat2 s=new Stat2();
		System.out.println("Value of instance variable is "+s.inVar); //using object
	}
}