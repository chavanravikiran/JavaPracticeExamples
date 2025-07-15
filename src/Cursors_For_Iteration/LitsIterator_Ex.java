package Cursors_For_Iteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

//Introduce in JDK 1.2
//Remove Operation, add and modified operation Perform
//Forword Direction As well AS Backword Direction
//Works onlu List (ArrayList and LinkedList)
public class LitsIterator_Ex {

	 public static void main(String[] args) {
        List<String> techStack = new ArrayList<>(Arrays.asList("C", "Java", "Python", "React"));
        ListIterator<String> list = techStack.listIterator();

        // Forward Direction
        System.out.println("Forward Direction-->");
        while (list.hasNext()) {
            System.out.print(list.next() +",");
        }
        
        System.out.println();
        // Backward Direction
        System.out.println("Backward Direction-->");
        while (list.hasPrevious()) {
            System.out.print(list.previous() +",");
        }
        
        System.out.println();
        // Reset Iterator for Forward Traversal Again
        list = techStack.listIterator();
        System.out.println("Forward Direction Again-->");
        while (list.hasNext()) {
            System.out.println(list.next());
        }

        System.out.println();
        // Add "Ruby" using ListIterator
        System.out.println("Adding Ruby...");
        list.add("Ruby");

        // Reset Iterator for Modification
        list = techStack.listIterator();
        System.out.println("\nModification Java = Spring Boot -->");
        while (list.hasNext()) {
            if (list.next().equals("Java")) {
                list.set("Spring Boot");
            }
        }

        // Display Updated List
        System.out.println("Updated List: " + techStack);

        // Reset Iterator for Removal
        list = techStack.listIterator();
        while (list.hasNext()) {
            if (list.next().length() == 1) { // Removing single-character elements like "C"
                list.remove();
            }
        }

        // Display Final List
        System.out.println("Final List after Removal: " + techStack);
    }
}
