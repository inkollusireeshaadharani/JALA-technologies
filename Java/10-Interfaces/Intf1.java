
//Create an interface with only one method and implement it in a class. Call the method 
//implemented.



interface Inter1 {
	void display();
}


class Intf1 implements Inter1 {
	public void display(){
	System.out.println("Hello");
	}
	public static void main(String[] args)
	{
		Intf1 t = new Intf1();
		t.display();
	}
}
