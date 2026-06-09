package BasicQuestion;

public class SingltonClassTest {
	public static void main(String[] args) {
		SingletonClass s1 = SingletonClass.getSingletonClass();
		SingletonClass s2 = SingletonClass.getSingletonClass();
			
		System.out.println(s1==s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		EagerSingletonClass eq1 = EagerSingletonClass.getInstance();
		EagerSingletonClass eq2 = EagerSingletonClass.getInstance();
		
		System.out.println(eq1==eq2);
		System.out.println(eq1.hashCode());
		System.out.println(eq2.hashCode());
	}
}
