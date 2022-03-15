// Write a program to find the prime or not.
import java.util.*;
class P9{
	public void isPrime(int n) {
		int i=1;
		int count=0;
		while(i<=n) {
			if(n%i==0)
				count+=1;
			i++;
		}
		if(count==2) {
			System.out.println("Number is a prime number");
		}
		else
			System.out.println("Number is not a prime number");
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		s.close();
		P9 p=new P9();
		p.isPrime(n);
	}
}