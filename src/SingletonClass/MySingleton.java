package SingletonClass;

//What is singleton class?
//A Singleton class is a class that allows only one instance of itself to be created throughout the entire application.

//Key Characteristics:
//1) Single instance: Only one object is ever created.
//2) Global access: The instance is globally accessible.
//3) Controlled instantiation: The class itself controls the instantiation process.

//Real-world Example
// Office Printer

//When to Use Singleton:?
//1) Logging services
//2) Configuration settings
//3) Database connections
//4) Cache managers

//Not thread-safe by default
//If you want to create then use (Synchronized Method)with Thread-safe Singleton 
//For Example :-
	//public static synchronized Singleton getInstance() {
	//    if (instance == null) {
	//        instance = new Singleton();
	//    }
	//    return instance;
	//}

public class MySingleton {

    // Step 1: Private static instance
    private static MySingleton instance;

    // Step 2: Private constructor
    private MySingleton() {
        // Prevent instantiation
    }

    // Step 3: Public static method to return instance
    public static MySingleton getInstance() {
        if (instance == null) {//two threads can create two different instances if they both enter the if (instance == null) block at the same time.
            instance = new MySingleton(); // create only if not already created
        }
        return instance;
    }
}

