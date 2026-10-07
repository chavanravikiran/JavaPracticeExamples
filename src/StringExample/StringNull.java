package StringExample;

public class StringNull {
	public static void main(String[] args) {
		
		String str = null;

		System.out.println(str); //null
		System.out.println("Hello " + str);//Hello null
		System.out.println(null +" Hello"); //null Hello
		System.out.println("A" + str + "B"); //AnullB
		
//		System.out.println(str.length());		//java.lang.NullPointerException:
		
		
		Integer a = 10;
		String b = "20";
		Integer c = null;
		Integer d = 30;
		String java = "Java";

		System.out.println(a + b);//1020
//		System.out.println(a + c);	////java.lang.NullPointerException:
		
		System.out.println(java + a + b); //Java1020
		System.out.println(a + d + java); //40Java
		
		
		
		
		
	}
}
