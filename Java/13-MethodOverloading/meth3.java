// Write two methods with the same name and same number of parameters of same type 
//and call from main method

//problem arises

class meth3{
	void display(int a,int b) {
		System.out.println("Hello1");
	}
//	void display(int a,int b) {
//		System.out.println("Hello2");
//	}
	public static void main(String args[]) {
		meth3 m=new meth3();
		m.display(1,1);
		m.display(2,2);
	}
}