package Collection_LinkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;

//No duplicate
//maintain insertio order
//only one null key is allowed or multiple null value
//non-synchronized
//curson is not applicable so need to retrive data using object.keySet().iterator()
public class LinkedHashMapExample {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> name = new LinkedHashMap<>();
		
		name.put(1,"Ravi"); 
		name.put(3,"avinash"); 
		name.put(2,"Ravikant"); 
		name.put(4,"virat");
		name.put(4,"virat");
		name.put(null,"Rohit");
		
		System.out.println("get value specified Element "+name.get(4));//pass key
		
		Iterator<Integer> itr= name.keySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
}
