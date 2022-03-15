//Write a function to find the minimum and maximum value of an array

class Arr8{
	public void minMax(int arr[]) {
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Minimum of array is "+min);
		System.out.println("Maximum of array is "+max);
	}
	public static void main(String args[]) {
		Arr8 a=new Arr8();
		int arr[]= {2,35,4,65,98,23,45,20};
		a.minMax(arr);
	}
}