//Write a function to test if array contains a specific value

import java.util.Scanner;

class Arr4{
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5,6};
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to find in the array");
		int n=s.nextInt();
		s.close();
		for(int i=0;i<arr.length;i++) {
			if(n==arr[i])
				System.out.println("number "+n+" found at index "+i);
		}
		
	}
}