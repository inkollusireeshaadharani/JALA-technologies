// Write a function to print your name and call the function from main method


class prog6{
	public void myName() {                                    //method
		System.out.println("My name is Dharani");
	}
	public static void main(String args[]) {
		prog6 p=new prog6();
		p.myName();                                          //calling the method from main method
	}
}