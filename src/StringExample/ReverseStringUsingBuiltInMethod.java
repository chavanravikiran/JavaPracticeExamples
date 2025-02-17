package StringExample;

public class ReverseStringUsingBuiltInMethod {
	public static void main(String[] args) {
		String name="Ravikiran";
		System.out.println("Given Original String -->"+name);
		
		StringBuffer sb = new StringBuffer(name);
		sb.reverse();
		System.out.println("Given String Is Reverse using Inbuilt Method-->"+sb);
	}
}
