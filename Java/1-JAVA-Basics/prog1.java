//How to create a class, object, method and its signature




class Myclass{                                //class creation
	int a=10;
	public void sayHello(String name) {       //method and its signature
		System.out.println("Hello "+name);
	}
}

class prog1{
	public static void main(String args[]) {
		Myclass mc=new Myclass();            //object creation
		System.out.println("a is "+mc.a);
		mc.sayHello("Ram");
	}
}