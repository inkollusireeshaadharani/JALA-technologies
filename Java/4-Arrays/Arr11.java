import java.util.ArrayList;

// Write a program to find the common values between two arrays

class Arr11{
	public void comVal(int arr1[],int arr2[]) {
		int i,j;
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(i=0;i<arr1.length;i++) {
			for(j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j])
					al.add(arr1[i]);
			}
		}
		
		
		int c=al.size();
		
		System.out.print("Common elements are ");
		for(i=0;i<c;i++) {
			System.out.print(al.get(i)+" ");
		}
		
	}
	public static void main(String args[]) {
		Arr11 m=new Arr11();
		int arr1[]= {1,2,3,4,5,6};
		int arr2[]= {2,3,9,10,11,12};
		m.comVal(arr1, arr2);
		}
}
