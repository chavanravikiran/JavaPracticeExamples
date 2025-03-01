package Multithreading;

//The getState() method returns the current state of a thread.
public class StateMethod {
	public static void main(String[] args) {
        StateExample t1 = new StateExample();

        System.out.println("State before start(): " + t1.getState()); // NEW
        t1.start();
        System.out.println("State after start(): " + t1.getState()); // RUNNABLE or TERMINATED

        try {
            Thread.sleep(100); // Allow thread to finish
            System.out.println("State after completion: " + t1.getState()); // TERMINATED
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class StateExample extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running...");
    }
}