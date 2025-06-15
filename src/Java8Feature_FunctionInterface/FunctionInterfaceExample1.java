package Java8Feature_FunctionInterface;

import java.util.function.Function;

//The Function<T, R> interface in Java 8 is a part of java.util.function package 
//and represents a function that accepts one argument and produces a result.

//Function
public class FunctionInterfaceExample1 {
	public static void main(String[] args) {
//		Function<T, R>
		
		//Pass String and Return Result -Length of String
		String name = "Ravikiran";
		Function<String, Integer> resultLength = x ->x.length();
		System.out.println("Length of String is - "+resultLength.apply(name));
		
		//Return Substring--First 4 Leters
		 Function<String, String> subString=x->x.substring(0, 4);
		 System.out.println("Return first 4 Charecters is -"+subString.apply(name));
		
	}
}
