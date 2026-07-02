package BasicQuestion;

public class OutputTraceEx11 {
	public static void main(String[] args) {
		
		for(int i=1; i<=20; i++) {
			if(i % 5 == 0) {
				System.out.println(i);
			}if(i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
}

//output
//----------------------------
//3
//5
//6
//9
//10
//12
//15
//15
//18
//20
