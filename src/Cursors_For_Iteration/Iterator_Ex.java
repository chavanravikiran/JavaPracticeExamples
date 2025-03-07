package Cursors_For_Iteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//Introduce in JDK 1.2
//Remove Operation only perform does not perform add or modified
//Forword Direction
//Work With List Set,Queue 
//It also Called As Universal Cursor
public class Iterator_Ex {

	public static void main(String[] args) {
		List<String> techStack = new ArrayList<>(Arrays.asList("C","Java","Python","React"));
		
		Iterator<String> it = techStack.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Remove
		while(it.hasNext()) {
			if(it.next().equals("C")) {
				techStack.remove(it);
			}
		}
	}
	
}
