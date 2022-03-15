import java.util.ArrayList;

//Write a method to find the second largest number in an array

class Arr14{
	public void secMax(int arr[]) {
		int max=arr[0];
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(max);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				al.add(max);
			}
		}
		int c=al.size();
		System.out.println("Second maximum of array is "+al.get(c-2));
	}
	public static void main(String args[]) {
		Arr14 a=new Arr14();
		int arr[]= {2,35,4,65,98,23,45,20};
		a.secMax(arr);
	}
}