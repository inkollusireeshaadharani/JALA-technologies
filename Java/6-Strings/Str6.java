//Matching a String Against a Regular Expression With matches()

class Str6{
	public static void main(String args[]) {
		String str="Welcome to Java learning.";
		
		System.out.println("\nIs Java a part of the given string? ");
		System.out.println(str.matches("(.*)Java(.*)"));
		
		System.out.println("\nIs \"Java\" the given string? ");
		System.out.println(str.matches("Java"));
		
		System.out.println("\nIs Welcome the beginning part of the given string? ");
		System.out.println(str.matches("Welcome(.*)"));
	}
}