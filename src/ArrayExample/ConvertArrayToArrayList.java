package ArrayExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToArrayList {
	public static void main(String[] args) {
		String city [] = {"Pune","Mumbai","Dehli","Chennai"};
		
		//convert Array to ArrayList
		List<String> list = Arrays.asList(city);
		System.out.println(list);
		
		//now Convert ArrayList to Array
		 ArrayList<String> fruitList = new ArrayList<>();
		 fruitList.add("Orange");
		 fruitList.add("Apple");
		 fruitList.add("Banana");
	
		 String fruitArray[] = new String[fruitList.size()];
		 fruitArray = fruitList.toArray(fruitArray);
		 
		 for (String str : fruitArray) {
	          System.out.print(str + " ");
		 }
	}
}
