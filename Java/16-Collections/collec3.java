//Create a HashSet with at least 10 elements of type String
//Write program covering all the operations of HashSet

import java.util.*;

class collec3{
	public static void main(String args[]) {
		HashSet<Integer> hs=new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.add(6);
		
		hs.remove(3);
		hs.clone();
		hs.contains(8);
		hs.isEmpty();
		hs.size();
	}
}