package BasicQuestion;

public class OutputTraceEx25 {
	public static void main(String[] args) {
		method1();
	}

	private static boolean method1() {
		int a[]= {12,15,43};
		
		try {
			System.out.println(a[2]);//43
			return true;
		}finally {
			System.out.println("End");//end
		}
	}
	
	
}

//Output
//-----------------
//43
//End
