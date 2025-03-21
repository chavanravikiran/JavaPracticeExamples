package BeginnerExample;

import java.util.ArrayList;

public class FindOutPrimeNumberTillNo {

	public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100:");
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int num = 1; num <= 100; num++) {
            if (isPrime(num)) {
                list.add(num);
            }
        }
        System.out.println(list);
    }

    private static boolean isPrime(int number) {
    	for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
