//Create an ArrayList of type String with 10 string elements. Add 10 string elements to 
//ArrayList and perform the below operations
//Add an element to the ArrayList
//Iterate through the ArrayList by using Iterator object
//Add an element at a specific index
//Remove an element from the ArrayList, Remove at an index
//Update the element at a specific index
//Check the element is present at a particular index
//Get an element at a particular index
//Find out the size of the ArrayList
//Check the given element is present in the ArrayList
//Remove all elements of the ArrayList

import java.util.*;

class collec1{
	public static void main(String args[]) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		al.add("F");
		al.add("G");
		al.add("H");
		al.add("I");
		al.add("J");
		
		Iterator<String> it=al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        al.remove("J");
        al.remove(8);
        al.add(7,"M");
        
        
        if(al.get(2)=="C") {
        	System.out.println("C at index 2");
        }
        
        System.out.println(al.get(5));
        int i=al.size();
        System.out.println(i);
        al.contains("A");
        al.clear();
        
        }
	}
