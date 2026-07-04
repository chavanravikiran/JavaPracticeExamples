package BasicQuestion;

public class OutputTraceEx24 {
	public static void main(String[] args) {
		int num = 8 * 25 / 50 / 4 * 90 * 2 / 15  + 18 * 3 - 14 * 3 - 10;
		
		System.out.println(num);//14
		
		
		int i = 5;
		int result = ++i + ++i + i++;
		
		System.out.println(i);	//8
		System.out.println(result);//20
		
		
		int a[]= {12,15,43};
		
		try {
			System.out.println(a[2]);//43
		}finally {
			System.out.println("End");//end
		}
	}
}

//Output
//----------------
//14
//8
//20
//43
//End
