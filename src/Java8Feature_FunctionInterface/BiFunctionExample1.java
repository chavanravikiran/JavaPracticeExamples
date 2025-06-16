package Java8Feature_FunctionInterface;

import java.util.function.BiFunction;

//Accept two input parameters
//It Accept Two input Parameters and return result
// R apply(T t,U u);
public class BiFunctionExample1 {
	public static void main(String[] args) {

		//1st Concatinate String take both input string type and return also String type 
		BiFunction<String, String, String> biFunction1 =(x,y) -> x.concat(y);
		System.out.println("Concatinate String -"+biFunction1.apply("Ravi", "Kiran"));//Ravikiran
		
		//2nd Find out of length of given concatinated string take both input parameter is String and return integer. 
		BiFunction<String, String, Integer> biFunction2 = (x,y) ->x.concat(y).length();
		System.out.println("Length of given Concatinate String "+biFunction2.apply("Ravi", "Kiran"));//9
		
	}
}
