package Multithreading;

//Yield Method is use to temporarily stop current thread and give chance to another thread for execution
public class YieldMethod {
	public static void main(String[] args) {
        YieldExample t1 = new YieldExample();
        YieldExample t2 = new YieldExample();
        
        t1.start();
        t2.start();
    }
}

class YieldExample extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
            Thread.yield(); // Give chance to other threads
        }
    }
}