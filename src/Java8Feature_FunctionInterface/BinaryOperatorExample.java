package Java8Feature_FunctionInterface;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

//Input & output type are same that time used UnaryOperator and BinaryOperator
//They are derived from Function and BiFunction
//Take two Input and Return Same Output type
//T apply(T t1, T t2);
public class BinaryOperatorExample {

	public static void main(String[] args) {
		//1st Concatinate String take both input string type and return also String type 
		BiFunction<String, String, String> biFunction1 =(x,y) -> x.concat(y);
		System.out.println("Concatinate String -"+biFunction1.apply("Ravi", "Kiran"));//Ravikiran
	
		BinaryOperator<String> biFunction2 =(x,y) -> x.concat(y);
		System.out.println("Concatinate String -"+biFunction2.apply("Ravi", "Kiran"));//Ravikiran
		
		BinaryOperator<String> biFunction3 = (str1,str2) -> str1 +" "+ str2;
		System.out.println("Concatinate String -"+biFunction3.apply("Ravi", "Kiran"));//Ravi kiran
	}
}
