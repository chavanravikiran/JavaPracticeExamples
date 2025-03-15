package ArrayExample;

import java.math.BigDecimal;
import java.util.ArrayList;

// Find Out Averae of Positive Number 
public class FindPositiveElementAverage {
	public static void main(String[] args) {
		
		ArrayList<Integer> aList = new ArrayList<>();

		aList.add(-6);
		aList.add(2);
		aList.add(-56);
		aList.add(8);
		aList.add(-5);
		aList.add(25);

		calculateAvgForPositiveNumber(aList);
	}

	private static void calculateAvgForPositiveNumber(ArrayList<Integer> aList) {
		int count =0;
//		int sum = 0;
		 BigDecimal sum = BigDecimal.ZERO;
		
		for (Integer element : aList) {
			if(element > 0) {
				count++;
//				sum+=element;
				sum = sum.add(BigDecimal.valueOf(element));
			}
		}
//		int average = sum/count;
		BigDecimal average = sum.divide(BigDecimal.valueOf(count), 2, BigDecimal.ROUND_HALF_UP);
		System.out.println("Average of Positve Number is "+average);
	}
}
