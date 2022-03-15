//Write two methods with the same name but different number of parameters of same type 
//and call the methods from main method

class meth1{
	void display(int a) {
		System.out.println("Hello1");
	}
	void display(int a,int b) {
		System.out.println("Hello2");
	}
	public static void main(String args[]) {
		meth1 m=new meth1();
		m.display(1);
		m.display(2,2);
	}
}