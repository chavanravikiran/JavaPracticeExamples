package Collection_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

//No maintained insertion order
//Allowed to one null key
//not thread safe / not synchronized
//Performance is faster
// does not allowed duplicate key but allowed to duplicate value
//Default capacity is 16 and load factor is 0.75
public class HashMapExample {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1,"Java");
		map.put(2,"Python");
		map.put(3,"React");
		map.put(4,"Ruby");
		map.put(null,"C++");
		map.put(5,"Angular");
		map.put(6,"Struds");
		map.put(7,"Struds");
		
		Set<Entry<Integer, String>>  itr = map.entrySet();
		for (Entry<Integer, String> entry : itr) {
			System.out.println(entry.getKey() + "-"+ entry.getValue());
		}
		System.out.println("---------------------------------");
		Iterator<Integer> keySetItr=map.keySet().iterator();
		for (Entry<Integer, String> entry : itr) {
			System.out.println(entry);
		}
	}
}
