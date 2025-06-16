package Java8Feature_Predicates;

import java.util.function.BiPredicate;

//Accept two input parameters
//It Accept Two input Parameters and return boolean
// boolean test(T t , U u)
public class BiPredicatesExample1 {
	public static void main(String[] args) {
		
		//1st Example 
		BiPredicate<String, String> biPredicates = (x,y)->x.length() == y.length();
		System.out.println("Both String are same or not - "+biPredicates.test("Ravi", "kiran"));//false
		System.out.println("Both String are same or not - "+biPredicates.test("Ravi", "Atul"));//True
		
		//2nd Example
		BiPredicate<String, String> biPred = (x,y) -> x.startsWith(y);
		System.out.println("1st String Starts With 'Ravi' - "+biPred.test("Ravikiran", "Ravi"));//True
		System.out.println("1st String Starts With 'Ravi' - "+biPred.test("Ravikiran", "kiran"));//fasle
	}
}
