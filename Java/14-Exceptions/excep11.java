//Write a program to generate FileNotFoundException


import java.io.*;

class excep11
{
public static void main(String[] args)
{
	FileReader reader = null;
	try {
		reader = new FileReader("file.txt");
	} 
	catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	
	BufferedReader br = new BufferedReader(reader);
	
	
	String data =null;
	
	
	try {
		while ((data = br.readLine()) != null)
		{
			System.out.println(data);
		}
	} 
	catch (IOException e) {
		e.printStackTrace();
	}
	
	try {
		br.close();
	}
	catch (IOException e) {
		e.printStackTrace();
	}
}
}
