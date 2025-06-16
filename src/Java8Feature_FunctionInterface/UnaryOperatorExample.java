package Java8Feature_FunctionInterface;

import java.util.function.Function;
import java.util.function.UnaryOperator;

//Input & output type are same that time used UnaryOperator and BinaryOperator
//They are derived from Function and BiFunction
//Take one Input and Return Same Output type
//T apply(T t);
public class UnaryOperatorExample {
	public static void main(String[] args) {
		
		String name="Ravikiran";
		//Return Substring--First 4 Leters
		 Function<String, String> subString = x-> x.substring(0, 4);
		 System.out.println("Return first 4 Charecters is -"+subString.apply(name));

		//Above Example is Old Way when Both input are same,
		 UnaryOperator<String> subString1 = x -> x.substring(0, 4);
		 System.out.println("Return first 4 Charecters is -"+subString.apply(name));
	}
}
