package Java8Feature_InterviewQuestions;

import java.util.stream.Collectors;
import java.util.stream.Stream;

//Generate the first 10 Fibonacci numbers using both the traditional way and Java Streams
public class FibonacciExample {
	 public static void main(String[] args) {
	        System.out.println("Traditional Fibonacci:");
	        printFibonacciTraditional(10);

	        System.out.println();
	        System.out.println("Stream-based Fibonacci:");
	        printFibonacciWithStream(10);
	    }

	    // 🔹 Method 1: Traditional iterative way
	    public static void printFibonacciTraditional(int n) {
	        int a = 0, b = 1;
	        for (int i = 0; i < n; i++) {
	            System.out.print(a + " ");
	            int next = a + b;
	            a = b;
	            b = next;
	        }
	    }

	    // 🔹 Method 2: Stream-based approach
	    public static void printFibonacciWithStream(int n) {
	        System.out.println(
	        		Stream.iterate(new int[] {0,1}, f -> new int[] {f[1],f[0]+f[1]})
	    	        .limit(n)
	    	        .collect(Collectors.toList())
	    	);
	    }
}
