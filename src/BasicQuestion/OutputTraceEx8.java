package BasicQuestion;

public class OutputTraceEx8 {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Java";
		int i = 10;
		int j = 20;
		
		System.out.println(i + j);//30
		System.out.println("i + j");//i + j
		System.out.println(str1 + i);//Hello10
		System.out.println(i + j + str1);//30Hello
		System.out.println(str1 + i * j);//  Hello200   Multiplication 1st then 
		System.out.println(str1 + j / i);//     Hello2
//		System.out.println(str1 + i - j);// Compilation Error
		System.out.println(str1 + i + j + str2);//Hello1020Java
		System.out.println(str1 + (i + j ) + str2);//Hello30Java
	}
	
}



//output
//--------------------------------------
//30
//i + j
//Hello10
//30Hello
//Hello200
//Hello2
//Hello1020Java*