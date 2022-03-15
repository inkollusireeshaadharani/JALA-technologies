//Try to call the constructor multiple times with the same object

class cons5{
	int a;
	cons5(){
		System.out.println("Constructor 1");
	}
	cons5(int a){
		System.out.println("Constructor 2");
	}
	cons5(int a,int b){
		System.out.println("Constructor 3");
	}
	public static void main(String args[]) {
		cons5 c1=new cons5();
		//c1.cons5();
		c1.a=10;
	}
}