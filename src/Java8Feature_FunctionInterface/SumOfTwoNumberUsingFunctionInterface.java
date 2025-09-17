package Java8Feature_FunctionInterface;

@FunctionalInterface
interface SumInterface{
	int sum(int a,int b);
}


public class SumOfTwoNumberUsingFunctionInterface {
	public static void main(String[] args) {
		SumInterface obj = (a,b)->{
			int value = a+b;
			System.out.println("Sum of Two Value is :"+ value);
			return a;
		};
		int a=obj.sum(10, 20);
		System.out.println(a);
	}
}
