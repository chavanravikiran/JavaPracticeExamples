package ArrayExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//To Convert ArrayList to Array--toArray()
//To Covert Array to ArrayList
public class ConvertArrayListToArray {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>(Arrays.asList("Cricket","Football","Baseball","Hockey"));
		
		String[] array = arrayList.toArray(new String[0]);
		
		for (String item : array) {
            System.out.println(item);
        }
		
		//Approch 1st To Covert Array to ArrayList
		List<String> newList1 = new ArrayList<>();
		for (String arr : array) {
			newList1.add(arr);
		}
		System.out.println("New ArrayList :"+newList1);
		
		//Approch 2nd 
		List<String> newList2 = new ArrayList<>(Arrays.asList(array));
		System.out.println("New ArrayList :"+newList2);
	}
}
