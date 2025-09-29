package BasicQuestion;

public class PerfectSquareTraditional {
    public static void main(String[] args) {
        int number = 49;
        if (isPerfectSquare(number)) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }
    }

    public static boolean isPerfectSquare(int num) {
        if (num < 0) {
        	return false;
        }

        for (int i = 1; i <= num / 2; i++) {
            if (i * i == num) {
                return true;
            }
        }

        if (num == 1) return true;

        return false; 
    }
}
