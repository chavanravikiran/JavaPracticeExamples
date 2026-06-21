package Collection_HashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapExample {
	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = new String("Java");
		
		//Internally Use -->first Create HashCode then find index then store in same hash code is present then store in linkedList and use equals() for check
		HashMap<String,String> map = new HashMap<>();
		map.put(s1, "Java");
		map.put(s2, "Java");
		
		System.out.println(map);

		
		//IdentityHashMap uses internally == for check reference or address of value not check value/HashCode
		IdentityHashMap<String,String> itMap = new IdentityHashMap<>();
		itMap.put(s1, "Java");
		itMap.put(s2, "Java");
		
		
		System.out.println(itMap);
		
	}
}
