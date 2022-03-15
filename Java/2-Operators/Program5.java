//Programs on Logical AND,OR operator and Logical NOT

class Program5{
    public static void main(String args[]) {
    	int num1=5;
    	int num2=10;
    	
    	if((num1<10)&&(num2<20))                         //logical AND
    		System.out.println(num1+num2);
    	
    	if((num1>10)||(num2<20))                         //logical OR
    		System.out.println(num1+num2);
    	
    	if(!(num1>10))                                   //logical NOT
    		System.out.println(false);
    }
}