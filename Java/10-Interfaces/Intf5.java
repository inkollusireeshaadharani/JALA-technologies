//Create two interfaces with the same method (same signature) in both the interfaces. 
//Implement these two interfaces in one class. Call the method

interface intf51
{
//public void show();
}

interface intf52
{
//public int show();
}

class Intf5 implements intf51,intf52
{
	//void show() // Overloaded method based on return type, Error
	//{
	//}
	//int show() // Error
//	{
//		return 1;
//	}
public static void main(String args[])
	{
	}
}
