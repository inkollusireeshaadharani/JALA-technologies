//Write a program to write text to .txt file using FileWriter

import java.io.FileWriter;  
class io6 {  
    public static void main(String args[]){    
         try{    
           FileWriter fw=new FileWriter("write.txt");    
           fw.write("Welcome to javaTpoint.");    
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
     }    
}