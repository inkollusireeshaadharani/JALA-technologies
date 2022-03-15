//Call the constructors(both default and argument constructors) of super class from a child 
//class

class cons21{
	int a=100;
	cons21(){
		
	}
	cons21(int a){
		System.out.println("Hello");
	}
}

class cons2 extends cons21{
	cons2(){
		super();
	}
	cons2(int a){
		super(2);
	}
}