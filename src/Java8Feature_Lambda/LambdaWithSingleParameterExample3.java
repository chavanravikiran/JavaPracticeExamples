package Java8Feature_Lambda;

import java.util.ArrayList;

public class LambdaWithSingleParameterExample3 {
	
	public static void main(String[] args) {
		 ArrayList<Integer> al = new ArrayList<Integer>();
	        al.add(1);
	        al.add(2);
	        al.add(3);
	        al.add(4);
	        
	     // Using lambda expression to print all elements of al
	     System.out.println("Elements of the ArrayList: ");
	     al.forEach(x->System.out.println(x));
	     
	     // Using lambda expression to print even elements of al
	     System.out.println("Even elements of the ArrayList: ");
	     al.forEach(y->{
	    	 if( y % 2 == 0) {
	    		 System.out.println("event No "+y);
	    	 }
	     });
	}
}
