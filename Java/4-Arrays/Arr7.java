import java.util.ArrayList;

//Write a function to insert an element at a specific position in the array

class Arr7{
	public int [] insertEle(int arr[],int pos,int ele) {
		int i;
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(i=0;i<arr.length;i++) {
			al.add(arr[i]);
		}
		
		al.add(pos,ele);
		
		int c=al.size();
		
		int newArr[]=new int[c];
		for(i=0;i<c;i++) {
			newArr[i]=al.get(i);
		}
		return newArr;
	}
	public static void main(String args[]) {
		Arr7 m=new Arr7();
		int myArray[]= {1,2,3,4,5,6};
		myArray=m.insertEle(myArray, 3, 75);
		for(int i=0;i<myArray.length;i++) {
			System.out.println(myArray[i]);
		}
	}
}