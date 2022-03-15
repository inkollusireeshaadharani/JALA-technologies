//Create a HashMap with at least 10 key value pairs of the Student ID and Name
//Insert a Key value mapping into the map
//Fetch the value of a Key
//Create a clone/copy of HashMap
//Check if the given Key is in the Map
//Check if the value is in the Map
//Check if the map is empty
//Print the size of the Map to the console
//Print all the Keys of the map to the console
//Print all the Keys of the map to the console
//Remove a specific Key-value pair
//Copy all the elements of the Map to another Map

import java.util.*;

class collec2{
	public static void main(String args[]) {
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("a",1);
		hm.put("b",2);
		hm.put("c",3);
		hm.put("d",4);
		hm.put("e",5);
		hm.put("f",6);
		hm.put("g",7);
		hm.put("h",8);
		hm.put("i",9);
		hm.put("j",10);
		
		
		System.out.println(hm.get("a"));
		
		System.out.println("The cloned map look like this: "
				+ hm.clone());
		
		hm.containsKey("c");
		hm.containsValue(1);
		
		hm.isEmpty();
		
		System.out.println(hm.size());
		
		System.out.println(hm.keySet());
		
		System.out.println(hm.values());
		
		hm.remove("a", 1);
		
		
		
		
	}
}







