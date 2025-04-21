package Java8Feature_Lambda;


//What is a Lambda Expression?
//A lambda expression is a shorter way to write an anonymous method (function).
//it is use with functional interfaces (interfaces with only one abstract method and multiple default and static method).

//What is anonymous class?
//A nested class doen't have any name is know as anonymous class.

public class LambdaExample1 {
	
	public static void main(String[] args) {
        MyPrinter printer = msg -> System.out.println("Message: " + msg);
        printer.print("Hello, Lambda!");
    }
}

@FunctionalInterface
interface MyPrinter {
    void print(String message);
}