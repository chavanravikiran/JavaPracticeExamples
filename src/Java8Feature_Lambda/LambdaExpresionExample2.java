package Java8Feature_Lambda;

public class LambdaExpresionExample2 {

	public static void main(String[] args) {
		//1st
		Sum sum = () -> {
	        int a = 4, b = 4;
	        System.out.println(a + b);
	    };
	    sum.add(); // invoke the lambda
	    
	    //2nd
	    Sum sum1 = () ->{
			System.out.println(4+7);
		};
		sum1.add();
	}
	
	
}

@FunctionalInterface
interface Sum {
    void add(); // no parameters, no return
}