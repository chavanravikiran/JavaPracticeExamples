package Cursors_For_Iteration;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Vector;

//Enumaration work with only vector and stack--Means work with legacy classes
//No edit /no add or no remove operation
//only forward direction
public class Enumaration_Cursor_Ex {

	public static void main(String[] args) {
		Vector<String> techStack = new Vector<>(Arrays.asList("C","Java","Python","React"));
		
		Enumeration<String> e= techStack.elements();
		
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
	}
}
