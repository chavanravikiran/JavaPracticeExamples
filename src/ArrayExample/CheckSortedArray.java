package ArrayExample;

public class CheckSortedArray {
	public static void main(String[] args) {
//		int[] array = {10,22,5,23,9,4,-7};
		int[] array = {10,22,45,67,89,97};
		
		boolean flag=isSorted(array);
		if(flag) {
			System.out.println("Array is Sorted");
		}else {
			System.out.println("Array is not Sorted");
		}
	}
	
	public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) { // If previous element is greater than next, not sorted
                return false;
            }
        }
        return true;
    }
}
