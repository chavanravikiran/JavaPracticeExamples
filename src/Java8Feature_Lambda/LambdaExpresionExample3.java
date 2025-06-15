package Java8Feature_Lambda;

public class LambdaExpresionExample3 {
	public static void main(String[] args) {
		SumOperation sumOperation =(a,b)->{
			System.out.println(a+b);
		};
		sumOperation.addOperation(20L, 5L);
	}
}

@FunctionalInterface
interface SumOperation {
    void addOperation(Long a,Long b); // no parameters, no return
}
