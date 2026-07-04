package BasicQuestion;

public class OutputTraceEx20 {
	public static void main(String[] args) {
		int count = 0;
		int i = 0;
		for(i=0;i<=10;i++) {
			if(i % 3 == 0) {
				count = 0;
			}
		}
		System.out.println(count); //0
		System.out.println(i); //11
	}
}
