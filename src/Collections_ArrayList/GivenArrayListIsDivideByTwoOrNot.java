package Collections_ArrayList;

import java.util.ArrayList;

public class GivenArrayListIsDivideByTwoOrNot {
	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<>();
		aList.add(4);
		aList.add(12);
		aList.add(15);//Not divide
		aList.add(8);
		
		System.out.println("Original Array List");
		for (Integer itr : aList) {
			System.out.println(itr);
		}
		
		if(toCheckGivenArrayListIsDivideByTwoOrNot(aList)) {
			System.out.println("Given All Array Element is divided by 2");
		}else {
			System.out.println("Given All Array Element is not divided by 2");
		}
	}

	private static boolean toCheckGivenArrayListIsDivideByTwoOrNot(ArrayList<Integer> aList) {
        for (Integer number : aList) {
            if (number % 2 != 0) {
                return false; // If any number is not divisible by 2, return false
            }
        }
        return true; // All elements are divisible by 2
    }
}
