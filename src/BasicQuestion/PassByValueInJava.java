package BasicQuestion;

import java.util.ArrayList;
import java.util.List;

//when you pass a variable to method ,java passess a copy of the value stored in that variable not the actual variable itself
public class PassByValueInJava {
	public static void main(String[] args) {
		Integer a=10;
		change(a);//Pass copy of variable not pass actual data
		System.out.println(a);
		
		List<String> str = new ArrayList<>();
		changeObject(str);//Pass Reference
		System.out.println(str);
	}
	
	static void change(Integer x) {
		x=100;
//		System.out.println(x);
	}
	
	static void changeObject(List<String> list) {
		list.add("Ravi");
	}
}
