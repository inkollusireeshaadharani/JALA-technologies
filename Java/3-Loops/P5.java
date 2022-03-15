//5. Write a program to print largest number among three numbers.

class P5{
	public static void main(String args[]) {
		int a=-2,b=-4,c=5;
		if(a>=b&&a>=c)
			System.out.println("a is the greatest");
		else if(b>=a&&b>=c)
			System.out.println("b is the greatest");
		else
			System.out.println("c is the greatest");
	}
}