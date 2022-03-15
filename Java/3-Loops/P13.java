//Program for multiple if else statement(Largest number in 10,20 and 30)

class P13{
	public static void main(String args[]) {
		int a=10,b=20,c=30;
		if(a>=b&&a>=c)
			System.out.println(a+" is the Largest");
		else if(b>=a&&b>=c)
			System.out.println(b+" is the Largest");
		else
			System.out.println(c+" is the Largest");
	}
}