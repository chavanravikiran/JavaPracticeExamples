package Java8Feature_Lambda;

public class LambdaWithZeroParameterExample2 {
	public static void main(String[] args)
    {
        // Lambda expression with zero parameters
        ZeroParameter zeroParamLambda = () -> System.out.println("This is a zero-parameter lambda expression!");

        // Invoke the method
        zeroParamLambda.display();
    }
}

@FunctionalInterface
interface ZeroParameter {
    void display();
}