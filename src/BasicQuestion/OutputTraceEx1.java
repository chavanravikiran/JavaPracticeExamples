package BasicQuestion;

public class OutputTraceEx1 {
	
//	public void sum(int a, int b) {
//		System.out.println("This is void sum Method :"+(a+b));
//	}
	
	public int sum(int a, int b) {
		System.out.println("This is void sum Method :"+(a+b));
		return a+b;
	}

	public static void main(String[] args) {
		OutputTraceEx1 q = new OutputTraceEx1();
		q.sum(10, 10);
		
		System.out.println(q.sum(10, 20));
	}
}

//Both methods have the same name and the same parameter list, Java treats them as duplicate methods.

//The return type (void vs int) is not part of the method signature.
//Method Signature in Java

//A method signature consists of:
//----------------------------------------------------------------------------------------------
//Method name
//Parameter types
//Parameter order

//It does not include:
//----------------------------------------------------------------------------------------------
//Return type ❌
//Access modifier (public, private) ❌
//static ❌
//final ❌
//throws clause ❌