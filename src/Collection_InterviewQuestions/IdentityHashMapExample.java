package Collection_InterviewQuestions;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapExample {
	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = new String("Java");
		
		HashMap<String, Integer> hashMap =new HashMap<>();
		hashMap.put(s1, 1);
		hashMap.put(s2, 2);
		
		System.out.println("HashMap Size : "+hashMap.size());
		
		IdentityHashMap<String, Integer> identity = new IdentityHashMap<>();
		identity.put(s1, 1);
		identity.put(s2, 2);
		
		System.out.println("Identity Hash Map Size : "+identity.size());
	}
}
