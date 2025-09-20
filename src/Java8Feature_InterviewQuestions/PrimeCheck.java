package Java8Feature_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PrimeCheck {	

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 50, 30, 20, 41, 50);
		numbers.stream()
        .filter(PrimeCheck::isPrime)
        .forEach(System.out::println);
		
		int primeSum = numbers.stream()
		        .filter(PrimeCheck::isPrime)
		        .mapToInt(Integer::intValue)
		        .sum();

		System.out.println("Sum of primes = " + primeSum);
	}
	
	private static boolean isPrime(int n) {
        if (n <= 1) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(n))
                .allMatch(i -> n % i != 0);
    }
}
