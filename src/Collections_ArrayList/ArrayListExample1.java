package Collections_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {
	public static void main(String[] args) {
        
		// Creating a list of names
        List<String> names = new ArrayList<>();

        // Adding Names
        names.add("Ravi");
        names.add("Kiran");
        names.add("Atul");
        names.add("Ashwini");
        names.add("Pooja");

        // Displaying the list
        System.out.println("Names List: " + names);

        // Accessing an element
        System.out.println("First Name: " + names.get(0));

        //add at given Possition
        names.add(1,"ravikiran");

        // Removing an element
        names.remove("Atul");
        System.out.println("After removing Atul: " + names);


        // Iterating over the list
        System.out.println("Iterating over the list:");
        for (String name : names) {
            System.out.println(name);
        }
        
    }
}
