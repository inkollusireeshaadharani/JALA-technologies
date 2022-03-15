//Write a program to generate Arithmetic Exception without exception handling


class excep1{
	public static void main(String args[]) {
		int a=10,b=0,c;
		if(b==0) {
			System.out.println("Dividing by zero");
		}
		else {
			c=a/b;
			System.out.println(c);
		}
	}
}