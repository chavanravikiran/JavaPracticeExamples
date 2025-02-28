package Multitreading;

public class ImplementingFromRunnableInterface {
	 public static void main(String[] args) {
		 MyRunnable t =new MyRunnable();
        Thread t1 = new Thread(t);
        t1.start();
     }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }
}
