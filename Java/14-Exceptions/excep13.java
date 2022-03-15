//Write a program to generate NoSuchFieldException

// Java program to demonstrate getField() method



class excep13{

	public Object obj;

	public static void main(String[] args)
		throws ClassNotFoundException, NoSuchFieldException
	{

		// returns the Class object for this class
		Class<?> myClass = Class.forName("Test");

		System.out.println("Class represented by myClass: "
						+ myClass.toString());

		String fieldName = "obj";
		System.out.println(
			fieldName + " Field of myClass: "
			+ myClass.getField(fieldName));
	}
}

