package ArrayExample;

//To find pairs of numbers whose sum is 10 from a given array:
//int[] arr = {1, 4, 7, 5, 3, 2, 6};
public class PairOfSum {

	public static void main(String[] args) {
		int arr[] = {1, 4, 7, 5, 3, 2, 6};
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]+arr[j] == 10) {
					System.out.println(arr[i] +" + "+arr[j]+ " = 10");
				}
			}
		}
		
		
	}
}
