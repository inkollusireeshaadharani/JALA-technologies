//Write a program to read text from .txt file using InputStream

import java.io.FileInputStream;  
class io1 {  
     public static void main(String args[]){    
          try{    
            FileInputStream fin=new FileInputStream("read.txt");    
            int i=fin.read();  
            System.out.print((char)i);    
  
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
         }    
        } 