package Output_Tracing;

public class PassByValueOutput {
	public static void main(String[] args) {
		int a = 10;
		String b = "Test";
		
		System.out.println("Local Veriable : "+ a + "-->" + b);
		changeMethod(a,b);
		System.out.println("Value After Change Method call : "+a + "-->" + b);
	}
	
	public static void changeMethod(Integer a,String b) {
		a = 20;
		b = "Development";
		System.out.println("value from changeMethod : "+a + "-->" + b);
	}
}
