package ArrayExample;

import java.util.Arrays;
import java.util.List;

public class ArrayToListExample {
	 public static void main(String[] args) {
	        String[] array = {"RAVI", "KIRAN", "ATUL", "CHAVAN"};

	        // Convert array to List
	        List<String> list = Arrays.asList(array);

	        System.out.println("Converted List: " + list);
	        System.out.println("original Array: " + Arrays.toString(array));
	    }
}
