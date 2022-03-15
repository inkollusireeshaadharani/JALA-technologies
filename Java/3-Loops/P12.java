//Print gender (Male/Female) program according to given M/F using switch

import java.util.Scanner;



class P12{
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your gender(M/F)");
		String g=s.next();
		s.close();
		
		switch(g) {
		case "M":
			System.out.println("Male");
			break;
		case "F":
			System.out.println("Female");
			break;
		}
	}
}