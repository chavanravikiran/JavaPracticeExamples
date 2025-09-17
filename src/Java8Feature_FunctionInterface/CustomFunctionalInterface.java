package Java8Feature_FunctionInterface;


@FunctionalInterface
interface MyFunctionalInterface {
    void printMessage(String msg);  // only one abstract method
}


public class CustomFunctionalInterface {
	public static void main(String[] args) {
		MyFunctionalInterface message = (msg) ->{
			System.out.println("Message :"+msg);
		};
		
		message.printMessage("this is my functional Interface Example");
	}
}
