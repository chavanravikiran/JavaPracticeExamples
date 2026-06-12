package StringExample;

//Compare two char arrays
public class CompareTwoCharArrays {
	public static void main(String[] args) {
		char[] arr1 = {'J','a','v','a'};
		char[] arr2 = {'J','a','v','a'};
		
		System.out.println(arr1.equals(arr2));
		System.out.println(java.util.Arrays.equals(arr1, arr2));
	}
}
