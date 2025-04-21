package Java8Feature_Lambda;

public class LambdaWithMultipleParameterExample4 {
	public static void main(String[] args) {
		
		
		MyInfterface add = (a, b) -> a + b;
		MyInfterface multiply = (a, b) -> a * b;
		MyInfterface substract = (a, b) -> a - b;
		
        // Using the operations
        System.out.println(add.operation(6, 3));  
        System.out.println(multiply.operation(4, 5));
        System.out.println(substract.operation(4, 5));
        
	}
}

@FunctionalInterface
interface MyInfterface {
    int operation(int a, int b);
}