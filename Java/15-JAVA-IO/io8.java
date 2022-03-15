//Write text to a .txt file using BufferedWriter

import java.io.*;  
class io8 {  
public static void main(String[] args) throws Exception {     
    FileWriter writer = new FileWriter("write.txt");  
    BufferedWriter buffer = new BufferedWriter(writer);  
    buffer.write("Welcome to javaTpoint.");  
    buffer.close();  
    System.out.println("Success");  
    }  
}