/*Define the local and Global variables with the same name and print both variables and 
understand the scope of the variables
*/
class prog5{
	int var=20;
	public void showLocal() {
		int var=10;
		System.out.println("Local value is "+var);//prints local variable
	}
	public void showGlobal() {
		System.out.println("Global value is "+var);//prints global variable
	}
	public static void main(String args[]) {
		prog5 p=new prog5();
		p.showGlobal();
		p.showLocal();
	}
}