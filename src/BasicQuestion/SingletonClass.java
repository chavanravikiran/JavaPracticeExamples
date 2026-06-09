package BasicQuestion;

public class SingletonClass {
	//1. create private static field -->Create class instance
	private static SingletonClass singletonClass;
	
	//2.private Constructor
	private SingletonClass() {
		
	}
	
	public static SingletonClass getSingletonClass(){
		
		if(singletonClass == null) {
			singletonClass = new SingletonClass();
		}
		return singletonClass;
	}
}
