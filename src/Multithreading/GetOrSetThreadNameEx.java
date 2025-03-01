package Multithreading;

public class GetOrSetThreadNameEx {
	public static void main(String[] args) {
        
		// Creating threads and setting names
        MyThreads t1 = new MyThreads();
        MyThreads t2 = new MyThreads("Worker-2");

        // Getting thread names before starting
        System.out.println("Thread 1 Name: " + t1.getName());
        System.out.println("Thread 2 Name: " + t2.getName());

        // Start the threads
        t1.start();
        t2.start();

        // Setting new names after start
        t1.setName("Processor-1");
        t2.setName("Processor-2");

        // Getting thread names after renaming
        System.out.println("Renamed Thread 1: " + t1.getName());
        System.out.println("Renamed Thread 2: " + t2.getName());
    }
}

class MyThreads extends Thread {
    public MyThreads(String name) {
        super(name); // Set thread name using constructor
    }

    public MyThreads() {
	}

	@Override
    public void run() {
        System.out.println("Thread Running: " + Thread.currentThread().getName());
    }
}
