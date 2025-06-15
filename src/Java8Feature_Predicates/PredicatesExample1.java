package Java8Feature_Predicates;

import java.util.function.Predicate;

//Use in if condition instead of if we can use predicates
//
public class PredicatesExample1 {
	public static void main(String[] args) {
		
		Predicate<Integer> predicate = x -> x % 2 ==0;
		System.out.println(predicate.test(20));
		
		Predicate<Integer>	predi=salary -> salary > 10000;
		System.out.println("Sallery is greater than 10000 :-"+predi.test(1000));

		//1st Way 
		String name="Ravikiran";
		Predicate<String> startsWithR= x->x.startsWith("R");
		System.out.println("If given Name Start with R -"+startsWithR.test(name));
		
		//2nd Way 
		Predicate<String> startsWithRUsingCharAt = x->x.toLowerCase().charAt(0) == 'k';
		System.out.println("If given Name Start with K -"+startsWithRUsingCharAt.test(name));
		
		//End With 
		Predicate<String> endWithRUsingCharAt =x -> x.toLowerCase().charAt(name.length()-1)=='n';
		System.out.println("End With -"+endWithRUsingCharAt.test(name));
		
		//And default Method--Need both True
		Predicate<String> andPredicates=startsWithRUsingCharAt.and(endWithRUsingCharAt);
		System.out.println("'AND' - Start With K and End with N-" +andPredicates.test(name));//False
		
		Predicate<String> andPredicates1=startsWithR.and(endWithRUsingCharAt);
		System.out.println("'AND' - Start With R and End with N-" +andPredicates1.test(name));//True
		
		//Or default Method--Need any one true
		Predicate<String> orPredicates=startsWithRUsingCharAt.or(endWithRUsingCharAt);
		System.out.println("'OR' - Start With K and End with N-" +orPredicates.test(name));//true
		
		Predicate<String> orPredicates1=startsWithR.or(endWithRUsingCharAt);
		System.out.println("'OR' - Start With R and End with N-" +orPredicates1.test(name));//True
		
		//negate 
		Predicate<String> negatePredicates1=startsWithR.negate();
		System.out.println("'NEGATE' -" +negatePredicates1.test(name));//True asel tr false krte
	}
}
