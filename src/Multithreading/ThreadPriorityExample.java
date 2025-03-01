package Multithreading;

public class ThreadPriorityExample {
	 public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread("Thread-1");//setThreadName=Thread-1
        PriorityThread t2 = new PriorityThread("Thread-2");
        PriorityThread t3 = new PriorityThread("Thread-3");

        // Set different priorities
        t1.setPriority(Thread.MIN_PRIORITY);  // Priority 1
        t2.setPriority(Thread.NORM_PRIORITY); // Priority 5 (default)
        t3.setPriority(Thread.MAX_PRIORITY);  // Priority 10

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}
	class PriorityThread extends Thread {
		public PriorityThread(String name) {
			super(name);
		}
		
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority());
		}
	}
