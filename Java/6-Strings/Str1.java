//Different ways creating a string

class Str1{
	public static void main(String r[]) {
		String str1="";                                //creating string object and initializing later
		str1="Hello";
		
		String str2="Hi";                                //creating and initializing string object
		
		String str3=new String("Hello again");         //using constructor
		
		char ch[]= {'H','e','y'};                     //using character array
		String str4=new String(ch);
		
		System.out.println("String 1 "+str1);
		System.out.println("String 2 "+str2);
		System.out.println("String 3 "+str3);
		System.out.println("String 4 "+str4);
	}
}