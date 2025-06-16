package Java8Feature_MethodReference;

//Method Reference:-A method reference is a shorthand way of calling a method using the :: operator .Without creating new Opbject.
//Or Method Reference is java provide a way to refer to method without invoke / executing them.
//They are a shorthand notation for lambda expresion and improve code Readability.

//Why Use Method Reference ?
//Instead of writing a lambda expression, you can refer to an existing method if it matches the signature
//Reduce boilerplate code.
//Improve code Readability.

//Type of method Reference
//	1)Static Method Reference
//	2)Instance Method Reference
//	3)Constructor Method Reference

//Static Method Reference:-
public class StaticMethodReferenceEx1 {
	public static void printMessage() {
        System.out.println("Hello from static method");
    }

    public static void main(String[] args) {
        Runnable r = StaticMethodReferenceEx1::printMessage; // Method Reference
        r.run(); // Output: Hello from static method
    }
}
