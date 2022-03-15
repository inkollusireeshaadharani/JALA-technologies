//Program for relational operators (<,<=, >, >=)

class Program6{
	public static void main(String args[]) {
		int x=10,y=20;
		if(x<y)
			System.out.println(x+" less than "+y);
		
		if(x<=y)
			System.out.println(x+" less than equal to "+y);
		
		x=20;
		y=10;
		
		if(x>y)
			System.out.println(x+" greater than "+y);
		
		if(x>=y)
			System.out.println(x+" greater than equal to "+y);
	}
}