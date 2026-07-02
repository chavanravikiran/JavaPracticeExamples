package BasicQuestion;

public class OutputTraceEx14 {
	public static void main(String[] args) {
		String str1 = "Ravikiran";//SCP
		String str2 = "Ravikiran";//SCP
		
		String str3 = new String("Ravikiran");//Heap
		
		System.out.println(str1 == str2);//true
		System.out.println(str1.equals(str2));//true

		System.out.println(str1 == str3);//false
		System.out.println(str1.equals(str3));//true
	}
}
