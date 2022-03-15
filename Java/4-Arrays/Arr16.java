//Write a function to get the difference of largest and smallest value

class Arr16{
	public void minMaxDiff(int arr[]) {
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
		
		System.out.println("Difference between maximum and minimum of array is "+(max-min));
	}
	public static void main(String args[]) {
		Arr16 a=new Arr16();
		int arr[]= {2,35,4,65,98,23,45,20};
		a.minMaxDiff(arr);
	}
}