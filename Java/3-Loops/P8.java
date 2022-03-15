//Write a program to find Armstrong number or not

class P8{
	public void isArm(int n) {
		int temp;
		double count=0;
		int num=n;
		while(num>0) {
			temp=num%10;
			count+=1;
			num=num/10;
		}
		double sum=0;
		double gen;
		num=n;
        while(num>0) {
        	temp=num%10;
        	gen=Math.pow(temp, count);
        	sum+=gen;
        	num=num/10;
        }
        if(n==sum) {
        	System.out.println("Armstrong number");
        }
        else
        	System.out.println("Not an Armstrong number");
		
	}
	public static void main(String args[]) {
		P8 p=new P8();
		int a =407;
        p.isArm(a);
	}
}