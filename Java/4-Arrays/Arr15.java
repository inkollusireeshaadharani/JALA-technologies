//Write a method to find number of even number and odd numbers in an array

class Arr15{
	public void finder(int arr[]) {
		int odd=0,even=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even++;
			}
			else
				odd++;
		}
		System.out.println("Odd count "+odd);
		System.out.println("Even count "+even);
	}
	public static void main(String args[]) {
		Arr15 a=new Arr15();
		int arr[]= {1,2,3,4,567,654,2345,667};
		a.finder(arr);
	}
}