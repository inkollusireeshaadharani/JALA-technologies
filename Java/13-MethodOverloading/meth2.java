//Write two methods with the same name but different number of parameters of different 
//data type and call the methods from main method

class meth2{
	void display(int a) {
		System.out.println("Hello1");
	}
	void display(int a,char b) {
		System.out.println("Hello2");
	}
	public static void main(String args[]) {
		meth2 m=new meth2();
		m.display(1);
		m.display(2,'a');
	}
}