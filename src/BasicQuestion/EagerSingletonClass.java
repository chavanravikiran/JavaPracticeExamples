package BasicQuestion;

//Below is thread safe -Eager Signleton Class
public class EagerSingletonClass {
	private static EagerSingletonClass eagerSingletonClass = new EagerSingletonClass();
	
	private EagerSingletonClass() {
		
	}
	
	public static synchronized EagerSingletonClass getInstance() {
		return eagerSingletonClass;
	}
}
