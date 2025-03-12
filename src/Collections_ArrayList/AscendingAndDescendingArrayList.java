package Collections_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class AscendingAndDescendingArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<>();
		aList.add(1);
		aList.add(11);
		aList.add(3);
		aList.add(193);
		aList.add(43);
		aList.add(8);
		
		System.out.println("Original Array List");
		for (Integer itr : aList) {
			System.out.println(itr);
		}
		ascending(aList);
		descending(aList);
	}

	private static void ascending(ArrayList<Integer> aList) {
		Collections.sort(aList);//Automatically Ascending Order
		System.out.println("After Ascending Order");
		for (Integer itr : aList) {
			System.out.println(itr);
		}
	}
	private static void descending(ArrayList<Integer> aList) {
		System.out.println("After Descending Order");
		
		Collections.sort(aList,Collections.reverseOrder());
		for (Integer itr : aList) {
			System.out.println(itr);
		}		
	}
}
