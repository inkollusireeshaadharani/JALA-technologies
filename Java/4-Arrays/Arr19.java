import java.util.ArrayList;

//Write a function to find the missing number of sorted array of 1 to 100

class Arr19{
	public void sortedArray(int arr[]) {
		int i;
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(i=0;i<arr.length;i++) {
				al.add(arr[i]);
		}
		
		for (int element =1;element<=100;element++) {
            if (!al.contains(element)) {
            	System.out.println(element+" is not present in the array");
                al.add(element);
            }
        } 
	}
	public static void main(String args[]) {
		int arr[]= {1,2,3,5,7,8,9,10,12,18,19,20,21,29,45,47,48,55,67,69,70,99,100};
		Arr19 a=new Arr19();
		a.sortedArray(arr);
	}
}