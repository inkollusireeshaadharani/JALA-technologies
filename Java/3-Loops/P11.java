import java.util.Scanner;

//Program to check whether a number is EVEN or ODD using switch

class P11{
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		s.close();
		
		switch(n%2) {
		case 0:
			System.out.println(n+" Is even");
			break;
		case 1:
			System.out.println(n+" Is odd");
			break;
		}
	}
}