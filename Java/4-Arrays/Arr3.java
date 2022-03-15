//Write a program to find the index of an array element

import java.util.*;

class Arr3{
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5,6};
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to find index ");
		int n=s.nextInt();
		s.close();
		for(int i=0;i<arr.length;i++) {
			if(n==arr[i])
				System.out.println("number found at index "+i);
		}
		
	}
}