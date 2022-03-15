//Write a function to reverse an array of integer values

class Arr9{
	public int [] revArr(int arr[]) {
		int temp[]=new int[arr.length];
		int c=arr.length;
		for (int i=0;i<arr.length;i++) {
			temp[c-i-1]=arr[i];
		}
		return temp;
	}
	public static void main(String args[]) {
		Arr9 a=new Arr9();
		int arr[]= {1,2,3,4,5,6};
		arr=a.revArr(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
}