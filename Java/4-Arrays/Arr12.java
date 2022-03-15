import java.util.ArrayList;

//Write a method to remove duplicate elements from an array

class Arr12{
	public int [] removeDupElement(int arr[]) {
		int i;
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(i=0;i<arr.length;i++) {
				al.add(arr[i]);
		}
		ArrayList<Integer> newList=new ArrayList<Integer>();
		for (int element : al) {
			  
            // If this element is not present in newList
            // then add it
            if (!newList.contains(element)) {
                newList.add(element);
            }
        } 
		int c=newList.size();
		int newArr[]=new int[c];
		for(i=0;i<c;i++) {
			newArr[i]=newList.get(i);
		}
		
		
		return newArr;
		
	}
	public static void main(String args[]) {
		int arr[]= {1,2,3,3,3,4,5,6,6,6};
		Arr12 a=new Arr12();
		arr=a.removeDupElement(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
}