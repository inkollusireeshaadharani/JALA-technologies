//Write a function to calculate the average value of an array of integers

class Arr2{
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5,6};
		int sum=0;
		for(int i=0;i<arr.length;i++)
			sum+=arr[i];
		double avg=(double)sum/arr.length;
		System.out.println("average is "+avg);
	}
}