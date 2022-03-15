//Call constructor of the current class using this()

class tas3{
	int a;
	tas3(){
		System.out.println("Hello");
	}
	tas3(int a) {
		this();
	}
	public static void main(String args[]) {
		tas3 t=new tas3(2);
		t.a=10;
	}
}
