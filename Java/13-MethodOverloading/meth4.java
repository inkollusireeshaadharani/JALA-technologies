//Write two methods with the same name and same number of parameters of different 
//type and call from main method

class meth4{
	void display(int a,int b) {
		System.out.println("Hello1");
	}
	void display(char a,char b) {
		System.out.println("Hello2");
	}
	public static void main(String args[]) {
		meth4 m=new meth4();
		m.display(1,2);
		m.display('b','a');
	}
}