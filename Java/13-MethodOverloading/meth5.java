//Write two methods with the same name, number of parameters and data type but 
//different return Type

//problem arises

class meth5{
	void display(int a,int b) {
		System.out.println("Hello1");
	}
//	int display(int a,int b) {
//		System.out.println("Hello2");
//		return 2;
//	}
	public static void main(String args[]) {
		meth5 m=new meth5();
		m.display(1,1);
		m.display(2,2);
	}
}