package StringExample;

public class StringConcatExample {
	public static void main(String[] args) {
		
		String a="Ravi";
		String b="Kiran";
		String c="Chavan";
		
		String operator=usingPlusOperator(a,b,c);
		System.out.println(operator);
		
		String concat=usingconcat(a,b,c);
		System.out.println(concat);
		
		String stringBuilder=usingStringBuilder(a,b,c);
		System.out.println(stringBuilder);
		
		String join=usingJoin(a,b,c);
		System.out.println(join);
	}


	//Using + Operator (Simple and Readable)
	private static String usingPlusOperator(String a, String b, String c) {
		return a+b+c;
	}

	//Using concat() Method
	private static String usingconcat(String a, String b, String c) {
		return a.concat(b).concat(c);
	}
	
	//Using StringBuilder (Best for Performance)
	private static String usingStringBuilder(String a, String b, String c) {
		StringBuilder sb = new StringBuilder();
		sb.append(a);
		sb.append(b);
		sb.append(c);
		return sb.toString();
	}
	
	//Using String.join() (Best for Joining Multiple Strings)
	private static String usingJoin(String a, String b, String c) {
		return String.join("",a, b, c);
	}
	
}
