package Collections_ArrayList;

import java.util.ArrayList;

//Calculate expected sum using the sum formula: s=n*(n+1)/2
//Calculate actual sum of elements in the list.
//Find the missing number using	:-Missing Number=Expected Sum - Actual Sum
public class FindOutMissingNumber {
	public static void main(String[] args) {
		addinArray(1,100);
	}

	private static void addinArray(int startElement, int endElement) {
		ArrayList<Integer> list = new ArrayList<>();
		int actualSum = 0;
		for(int i=startElement; i<= endElement; i++) {
			if(i != 40) {
				list.add(i);
				actualSum += i;
			}
		}
		System.out.println("List"+list);
		int expectedSum = (endElement * (endElement + 1)) / 2;
		int missingNumber = expectedSum - actualSum;
		
		System.out.println("Missing Number is : "+missingNumber);
	}
}
