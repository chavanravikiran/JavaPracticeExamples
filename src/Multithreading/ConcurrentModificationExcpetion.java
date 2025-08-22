package Multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationExcpetion {
	public static void main(String[] args) {
		
		failFastIterator();//Modification nahi karu shakat fail fast madhe--ConcurrentModificationException throw error.Works on ArrayList HashMap,HashSet,LinkedList
		failSafeIterator();//Modification karu shakat fail safe madhe--CopyOnWriteArrayList,ConcurrentHashMap
		
	}
	
	private static void failFastIterator() {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		
		for(String s : list) {
			list.add("C");// ConcurrentModificationException
		}
		System.out.println(list);
	}

	private static void failSafeIterator() {
		List<String> list = new CopyOnWriteArrayList<>();
		list.add("A");
		list.add("B");
		
		for (String s : list) {
			list.add("C"); // No exception, iterates safely
		}
		System.out.println(list); // [A, B, C, C]
	}

}

