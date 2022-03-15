//Call argument constructor of current class using this()

class tas4{
	int a;
	tas4(){
		this(2);
	}
	tas4(int a) {
		System.out.println("Hello");
	}
	public static void main(String args[]) {
		tas4 t=new tas4(2);
		t.a=10;
	}
}