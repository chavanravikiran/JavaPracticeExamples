package StringExample;

//Java Program to Swap two Strings without using Third Variable
public class SwapStringWithoutThirdVariable {
	public static void main(String[] args) {
		  String s1 = "Love";
		  String s2 = "You";
		  System.out.println("Before swapping, s1 = " +s1+ ", s2 = "+s2 );

		  withoutThirdVarible(s1,s2);
		  
		  withThirdVariable(s1,s2);
		}


	private static void withoutThirdVarible(String s1, String s2) {
		// Concatenate both the string s1 and s2 and store it in s1    
		   s1 = s1 + s2;    

		   // Extract s2 from updated string s1.    
		   s2 = s1.substring(0, (s1.length() - s2.length()));    
		  
		// Extract s1 from updated string s1    
		   s1 = s1.substring(s2.length());   
		   System.out.println("After swapping without thrid Variable, s1 = " +s1+ ", s2 = "+s2 );
		
	}
	
	private static void withThirdVariable(String s1, String s2) {
		String temp = s1;
		s1 = s2;
		s2 = temp;
		System.out.println("After swapping using thrid Variable, s1 = " +s1+ ", s2 = "+s2 );		
	}
}
