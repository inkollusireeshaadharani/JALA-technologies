//Write a method for increment and decrement operators(++, --)

class Program2{
	public void id(int x) {
		System.out.println("Post increment of x "+(x++));
		System.out.println("Pre increment of x "+(++x));
		System.out.println("Post decrement of x "+(x--));
		System.out.println("Pre decrement of x "+(--x));
	}
	public static void main(String args[]) {
		int a=6;
		Program2 p=new Program2();
		p.id(a);
	}
}