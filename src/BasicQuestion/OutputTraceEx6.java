package BasicQuestion;

public class OutputTraceEx6 {
	public static void main(String[] args) {
		System.out.println(fun());
	}
	
	static int var = 10;
	
	static int fun() {
//		static int x = 0;// static,protected,public ,default nahi chalat karan class madhe lihile ahe mhnun pn class chya baher lihile aste tr chale aste
		int x = 0;
		return ++x;
	}
}


// we can't use static and access modifier inside method


//output 
//------------
//1
