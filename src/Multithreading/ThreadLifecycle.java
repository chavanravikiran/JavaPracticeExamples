package Multithreading;

class ThreadLife extends Thread {
    
    public void run() {
        System.out.println(Thread.currentThread().getName() + " - State: RUNNING");

        try {
            Thread.sleep(5000); // Moves to TIMED_WAITING state
            System.out.println(Thread.currentThread().getName() + " - State: WAITING");
            synchronized (this) {
                wait();  // Moves to WAITING state
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " - State: TERMINATED");
    }
}

public class ThreadLifecycle {
    public static void main(String[] args) throws InterruptedException {
        ThreadLife thread = new ThreadLife();

        System.out.println(thread.getName() + " - State: NEW");

        thread.start(); // Moves to RUNNABLE
        System.out.println(thread.getName() + " - State: " + thread.getState()); // Should be RUNNABLE

        Thread.sleep(10000);
        System.out.println(thread.getName() + " - State: " + thread.getState()); // Should be TIMED_WAITING

        synchronized (thread) {
            thread.notify(); // Moves thread from WAITING to RUNNABLE
        }

        Thread.sleep(1000);
        System.out.println(thread.getName() + " - State: " + thread.getState()); // Should be TERMINATED
    }
}
