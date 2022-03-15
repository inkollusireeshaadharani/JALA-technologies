//Write a function to copy an array to another array
class Arr6{
	public void arrayCopy(int arr[]) {
		int carr[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			carr[i]=arr[i];
		}
		System.out.println("Elements of original array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nElements of copied array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(carr[i]+" ");
		}	
		
	}
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5,6};
		Arr6 a=new Arr6();
		a.arrayCopy(arr);
	}
}