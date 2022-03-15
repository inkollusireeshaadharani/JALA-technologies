//Comparing strings using the methods equalsIgnoreCase(), startsWith(), endsWith() and compareTo()

class Str8{
	public static void main(String args[]) {
		String str1="Hello";
		String str2="hello";
		System.out.println("Is string 1 equal to string 2 after ignoring case?");
		System.out.println(str1.equalsIgnoreCase(str2));
		
		str2="He";
		
		System.out.println("Does the string 1 start with \'He\'?");
		System.out.println(str1.startsWith(str2));
		
		System.out.println("Does the string 1 end with \'le\'?");
		System.out.println(str1.endsWith("le"));
		
		str2="Cat";
		int a=str1.compareTo(str2);
		if(a<0)
			System.out.println(str1+" precedes "+str2+" lexicographically");
		else if(a>0)
			System.out.println(str1+" follows "+str2+" lexicographically");
		else 
			System.out.println(str1+" is equal to "+str2+" lexicographically");
		
	}
}