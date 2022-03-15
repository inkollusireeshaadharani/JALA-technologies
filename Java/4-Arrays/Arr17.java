//Write a method to verify if the array contains two specified elements(12,23)

class Arr17{
	public void myMethod(int arr[],int ele) {
		int i;
		for(i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				System.out.println(ele+" is present in the array at index "+i);
			}
		}
	}
	public static void main(String args[]) {
		int array[]= {1,2,3,23,4,5,6,12};
		Arr17 a=new Arr17();
		a.myMethod(array, 12);
		a.myMethod(array, 23);
	}
}