package BasicQuestion;

public class OutputTraceEx23 {
	public static void main(String[] args) {
		int i = 20;
		double d =i;
		
//		int j = d;//Compilation error down casting 
		//solved using 
		int j =(int) d;
		double d1 = 10;
		
		System.out.println(j / d1);//2.0
	}
}
