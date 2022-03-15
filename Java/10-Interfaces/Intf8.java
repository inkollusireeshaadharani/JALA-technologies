//Create a PUBLIC interface with fields and methods, fields should have values assigned. 
//Implement this interface to some class and print the values of the interface fields and 
//call the interface methods


//public 
interface intf81 {
	int a=10;
	void display();
	
}


class Intf8 implements intf81 {
	public void display(){
	System.out.println(a);
	}
	public static void main(String[] args)
	{
		Intf8 t = new Intf8();
		t.display();
	}
}