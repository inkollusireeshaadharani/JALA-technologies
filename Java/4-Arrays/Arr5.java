import java.util.ArrayList;

//Write a function to remove a specific element from an array

class Arr5{
	public int [] removeElement(int arr[],int e) {
		int i;
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(i=0;i<arr.length;i++) {
			if(arr[i]!=e) {
				al.add(arr[i]);
			}
		}
		int c=al.size();
		int newArr[]=new int[c];
		for(i=0;i<c;i++) {
			newArr[i]=al.get(i);
		}
		return newArr;
		
	}
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5,6};
		Arr5 a=new Arr5();
		arr=a.removeElement(arr, 2);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
}

















