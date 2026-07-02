package BasicQuestion;

public class OutputTraceEx7 {
	static int i = 10;
	
	public static void main(String[] args) {
		changeValue(i);
		System.out.println("from Main Method : "+i);//10
	}
	
	public static void changeValue(int i) {
		System.out.println("from inside changeValue() method but before :"+i);//10
		i = 50;
		System.out.println("from inside changeValue() method but after :"+i);//50
	}
}
