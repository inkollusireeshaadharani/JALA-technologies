import java.util.Scanner;

//Write a program to palindrome or not.

class P10{
	public void isPalindrome(int n) {
		int num=n;
		int temp;
		int sum=0;
		while(num>0) {
			temp=num%10;
			sum=(sum*10)+temp;
			num=num/10;
		}
		if(sum==n) {
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not a Palindrome");
	}
	public static void main(String args[]) {
		P10 p=new P10();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		s.close();
		p.isPalindrome(n);
	}
}