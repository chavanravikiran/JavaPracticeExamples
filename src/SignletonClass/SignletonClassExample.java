package SignletonClass;

public class SignletonClassExample {
	public static void main(String[] args) {
		
		Signletone s1 = Signletone.getInstance();
		Signletone s2 = Signletone.getInstance();
		
		System.out.println(s1 == s2);	//true
		System.out.println(s1.hashCode()); //1523554304
		System.out.println(s2.hashCode()); //1523554304
	}
	
}

class Signletone{
//1. prvaite static for prevent direct access from outside the class
	private static Signletone instance = new Signletone();
	
	//2. private contructor for create object only one time.when use public then create object multiple times.
	private Signletone() {
		
	}
	
	//3 return signleton class object
	public static Signletone getInstance() {
		return instance;
	}

}