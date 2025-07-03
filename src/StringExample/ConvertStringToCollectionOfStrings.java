package StringExample;

import java.util.Arrays;
import java.util.Collection;

//Convert a String to a Collection of Strings
public class ConvertStringToCollectionOfStrings {

	public static void main(String[] args) {
		String string = "apple,banana,orange,grape";
		
		Collection<String> collection=Arrays.asList(string.split(","));
		System.out.println(collection);
		
		
	}
}
