//Create an interface with two methods, but implement only one in a class. Call the 
//method implemented.

interface Inter2 {
	void display();
	//void show();
}


class Intf2 implements Inter2 {
	public void display(){
	System.out.println("Hello");
	}
	public static void main(String[] args)
	{
		Intf1 t = new Intf1();
		t.display();
	}
}