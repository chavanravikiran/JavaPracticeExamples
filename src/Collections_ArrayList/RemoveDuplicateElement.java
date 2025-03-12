package Collections_ArrayList;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicateElement {
	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<>();
		aList.add(1);
		aList.add(11);
		aList.add(1);
		aList.add(193);
		aList.add(43);
		aList.add(43);
		aList.add(8);
	
		System.out.println("Original "+aList);
		
		ArrayList<Integer> secondCopy = new ArrayList<>();
		//Copy Array 1st Approch
		secondCopy.addAll(aList);

		//Copy Array 2nd Approch
		//ArrayList<Integer> secondCopy = new ArrayList<>(aList);
		
		//Copy Array 3rd Approch
//		for (Integer num : aList) {
//		    secondCopy.add(num);
//		}
		//Using LinkedHashSet
		removeDuplicateElelement(aList);
		
		//Without LinkedHashSet
		removeDuplicate(aList);
	}


	private static void removeDuplicateElelement(ArrayList<Integer> aList) {
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(aList);
		System.out.println("Using LinkedHashSet "+linkedHashSet);
	}
	
	private static void removeDuplicate(ArrayList<Integer> aList) {
	    ArrayList<Integer> uniqueList = new ArrayList<>();
	    ArrayList<Integer> duplicateList = new ArrayList<>();

	    for (Integer num : aList) {
	        if (uniqueList.contains(num)) {
	        	duplicateList.add(num);
	        }else {
	        	uniqueList.add(num);
	        }
	    }

	    System.out.println("Using Manual Code Unique "+uniqueList);
	    System.out.println("Using Manual Code Duplicate "+duplicateList);
	}

}
