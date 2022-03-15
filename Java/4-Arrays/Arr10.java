//Write a function to find the duplicate values of an array

class Arr10{
	public void duplic(int arr[]) {
		
		int c=0;
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr.length;j++) {
				if((arr[i]==arr[j])&&(i!=j)) {
					c+=1;
				}
			
			}
			if(c>0)
				System.out.println("Element "+arr[i]+" is a duplicate at index "+i);
			c=0;
		}
		
	}
	public static void main(String args[]) {
		Arr10 a=new Arr10();
		int arr[]= {1,2,3,3,4,4,5,6};
		a.duplic(arr);
		
	}
}