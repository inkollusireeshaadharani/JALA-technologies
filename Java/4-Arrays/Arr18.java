import java.util.ArrayList;

//Write a program to remove the duplicate elements and return the new array
class Arr18{
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
		Arr18 a=new Arr18();
		arr=a.removeDupElement(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
}