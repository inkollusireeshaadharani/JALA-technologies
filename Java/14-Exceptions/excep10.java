//Write a program to generate ClassNotFoundException


class excep10 {
	public static void main(String args[])
	{
		try {
			Class.forName("My Class");
		}
		catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
