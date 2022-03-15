//Call instance methods in static method

class Stat4{
	                                                //instance methods
	public void display() {
		System.out.println("Display method");
	}
	
	public void show() {
		System.out.println("Show method");
	}   
	
	
	public static void main(String args[]) {        //static method
		Stat4 s=new Stat4();
		s.display();               //using object
		s.show();
	}
}