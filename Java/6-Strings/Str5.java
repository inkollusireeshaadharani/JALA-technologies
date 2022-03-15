//Searching in strings using indexOf()


class Str5{
	public static void main(String r[]) {
		String str="Hello Java is a great language. Java is easy to learn";  
		
		System.out.println("First occurence of java is at index of");      //can also pass ASCII value
		System.out.println(str.indexOf("Java"));
		
		System.out.println("Last occurence of java is at index of");
		System.out.println(str.lastIndexOf("Java"));
		
		System.out.println("occurence of java from index after 15 is at");
		System.out.println(str.indexOf("Java",15));
		
		
	}
}