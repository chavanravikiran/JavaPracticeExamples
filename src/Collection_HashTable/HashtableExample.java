package Collection_HashTable;

import java.util.Hashtable;
import java.util.Iterator;

// insertion order is not maintained (Unordered storage)
// no duplicate key or value
// synchronized
// default capacity is 11 or load factor 0.75
// Slower than HashMap Due to synchronization
public class HashtableExample {
	public static void main(String[] args) {
		
		Hashtable<Integer, String> language = new Hashtable<>();
		
		language.put(1, "Hindi");
		language.put(2, "English");
		language.put(3, "Marathi");
		language.put(1, "Urdu");
		
		System.out.println(language);
		
		//language.keys();
		Iterator<Integer> lang = language.keySet().iterator();
		while (lang.hasNext()) {
			System.out.println(lang.next());
		}
	}
}
