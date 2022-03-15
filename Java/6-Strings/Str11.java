//Splitting strings with split()

class Str11{
	public static void main(String args[]) {
		String str1="Hello Java Learning";
		String strArr[]=str1.split(" ");
		System.out.println(str1);
		System.out.println("After splitting the string into words");
		for(int i=0;i<strArr.length;i++) {
			System.out.println((i+1)+". "+strArr[i]);
		}
		
	}
}