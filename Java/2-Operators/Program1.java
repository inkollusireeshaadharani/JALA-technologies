//Write a function for arithmetic operators(+,-,*,/)




class Program1{
	
	void arithOper(int n1,int n2,char op){
		switch(op) {
		case '+':
			System.out.println(n1+n2);
			break;
		case '-':
			System.out.println(n1-n2);
			break;
		case '*':
			System.out.println(n1*n2);
			break;
		case '/':
			System.out.println(n1/n2);
			break;
		}
	}
	
	public static void main(String args[]) {
		int n1=10;
		int n2=5;
		Program1 p=new Program1();
		p.arithOper(n1, n2, '+');
		p.arithOper(n1, n2, '-');
		p.arithOper(n1, n2, '*');
		p.arithOper(n1, n2, '/');
	}
}