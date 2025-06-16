package Java8Feature_MethodReference;
//Method Reference:-A method reference is a shorthand way of calling a method using the :: operator .Without creating new Opbject.
//Or Method Reference is java provide a way to refer to method without invoke / executing them.
//They are a shorthand notation for lambda expresion and improve code Readability.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Why Use Method Reference ?
//Instead of writing a lambda expression, you can refer to an existing method if it matches the signature
//Reduce boilerplate code.
//Improve code Readability.

//Type of method Reference
//	1)Static Method Reference
//	2)Instance Method Reference
//	3)Constructor Method Reference

//Static Method Reference:-
public class StaticMethodReferenceEx2 {
	
	public static boolean isEven(Integer no) {
		return no % 2 ==0;
	}
	
	public static void main(String[] args) {
		List<Integer> no = Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer> result=no.stream()
							.filter(StaticMethodReferenceEx2::isEven)
							.collect(Collectors.toList());
		
		System.out.println("Result is "+result);
	}
}
