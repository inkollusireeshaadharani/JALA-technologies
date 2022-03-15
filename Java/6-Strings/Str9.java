//Trimming strings with trim()

class Str9{
	public static void main(String args[]) {
		String str1="Hello            ";
		
		System.out.print(str1);
		System.out.println(" -->string before trimming whitespace");
		System.out.print(str1.trim());
		System.out.println(" -->string after trimming whitespace");
	}
}