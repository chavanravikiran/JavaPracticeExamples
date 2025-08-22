package Multithreading;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationExcpetion {
	public static void main(String[] args) {
		
		List<String> list = new CopyOnWriteArrayList<>();
		list.add("A");
		list.add("B");

		for (String s : list) {
		    list.add("C"); // No exception, iterates safely
		}
		System.out.println(list); // [A, B, C, C]
		
	}
}

