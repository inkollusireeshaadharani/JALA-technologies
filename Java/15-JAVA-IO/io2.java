//Write a program to write text to .txt file using OutputStream

import java.io.FileOutputStream;  
class io2{  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("write.txt");    
             fout.write(65);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}