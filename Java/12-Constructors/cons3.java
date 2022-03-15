//Apply private, public, protected and default access modifiers to the constructor

//with private constructor object can't be instantiated

class cons3{
	int a;
	public cons3(){
		System.out.println("Constructor 1");
	}
//	private cons3(int a){
//		System.out.println("Constructor 2");
//	}
	protected cons3(int a,int b){
		System.out.println("Constructor 3");
	}
}