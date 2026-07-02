package BasicQuestion;

public class OutputTraceEx12 {
	public static void main(String[] args) {
		String s1 = "Stay Safe";
		String s2 = "Stay Safe";
		
		boolean result = s1 == s2;  //-->Compare Memory Address
		
		System.out.println(result);
		
//		switch (result) {			//----->in Switch Cannot switch on a value of type boolean.
//									//----->Only convertible int values, strings or enum variables are permitted
//			case true:
//				System.out.println("I am Safe");
//				break;
//			case false:
//				System.out.println("I am not Safe");
//				break;
//	
//			default:
//				System.out.println("I am not Safe");
//				break;
//		}
	}
}

//output 
//Compilation error at line 15
//Switch statement does not support boolean value
