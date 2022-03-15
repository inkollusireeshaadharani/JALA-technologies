//Create a PRIVATE or PROTECTED interface and print the values as above scenario

//private
//protected
interface intf91 {
	int a=10;
	void display();
	
}


class Intf9 implements intf91 {
	public void display(){
	System.out.println(a);
	}
	public static void main(String[] args)
	{
		Intf9 t = new Intf9();
		t.display();
	}
}